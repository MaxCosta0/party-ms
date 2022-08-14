package br.com.maxley.catalogms.service;

import br.com.maxley.catalogms.model.Item;
import br.com.maxley.catalogms.model.ItemCardResponse;
import br.com.maxley.catalogms.model.NewItemRequest;
import br.com.maxley.catalogms.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ChangeCatalogItem {

    private final ItemRepository itemRepository;

    public ChangeCatalogItem(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ItemCardResponse handle(Long itemId, NewItemRequest newItemRequest) {
        Item foundItem = itemRepository.findById(itemId).orElseThrow();

        Item newItem = Item.fromNewItemRequest(newItemRequest);
        newItem.setId(foundItem.getId());

        return ItemCardResponse.fromEntity(itemRepository.save(newItem));
    }
}
