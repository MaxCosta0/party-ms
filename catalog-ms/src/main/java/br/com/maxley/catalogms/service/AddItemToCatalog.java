package br.com.maxley.catalogms.service;

import br.com.maxley.catalogms.model.Item;
import br.com.maxley.catalogms.model.ItemCardResponse;
import br.com.maxley.catalogms.model.NewItemRequest;
import br.com.maxley.catalogms.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class AddItemToCatalog {

    private final ItemRepository itemRepository;

    public AddItemToCatalog(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ItemCardResponse handle(NewItemRequest newItemRequest) {
        Item newItem = itemRepository.save(newItemRequest);
        return ItemCardResponse.fromEntity(newItem);
    }
}
