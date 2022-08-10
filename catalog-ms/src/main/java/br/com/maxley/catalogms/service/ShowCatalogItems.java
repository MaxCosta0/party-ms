package br.com.maxley.catalogms.service;

import br.com.maxley.catalogms.model.ItemCardResponse;
import br.com.maxley.catalogms.repository.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ShowCatalogItems {
    private final ItemRepository itemRepository;

    public ShowCatalogItems(ItemRepository itemRepository, ModelMapper modelMapper) {
        this.itemRepository = itemRepository;
    }

    public Page<ItemCardResponse> handle(Pageable pageable) {

        return itemRepository.findAll(pageable).map(ItemCardResponse::fromEntity);
    }
}
