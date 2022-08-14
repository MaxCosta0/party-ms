package br.com.maxley.catalogms.service;

import br.com.maxley.catalogms.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class RemoveItemFromCatalog {
    private final ItemRepository itemRepository;

    public RemoveItemFromCatalog(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void handle(Long itemId) {
        itemRepository.deleteById(itemId);
    }
}
