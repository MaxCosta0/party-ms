package br.com.maxley.catalogms.controller;

import br.com.maxley.catalogms.model.ItemCardResponse;
import br.com.maxley.catalogms.service.ShowCatalogItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;

public class ShowCatalogItemsController implements ItemController {
    @Autowired
    private ShowCatalogItems showCatalogItems;

    @GetMapping("/items")
    public Page<ItemCardResponse> catalogList(@Valid Pageable pageable) {
        return showCatalogItems.handle(pageable);
    }
}
