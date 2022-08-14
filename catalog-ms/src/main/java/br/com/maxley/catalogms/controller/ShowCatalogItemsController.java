package br.com.maxley.catalogms.controller;

import br.com.maxley.catalogms.model.ItemCardResponse;
import br.com.maxley.catalogms.service.ShowCatalogItems;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/catalog")
public class ShowCatalogItemsController {
    private final ShowCatalogItems showCatalogItems;

    public ShowCatalogItemsController(ShowCatalogItems showCatalogItems) {
        this.showCatalogItems = showCatalogItems;
    }

    @GetMapping("/items")
    public Page<ItemCardResponse> handle(@Valid Pageable pageable) {
        return showCatalogItems.handle(pageable);
    }
}
