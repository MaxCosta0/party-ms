package br.com.maxley.catalogms.controller;

import br.com.maxley.catalogms.model.ItemCardResponse;
import br.com.maxley.catalogms.model.NewItemRequest;
import br.com.maxley.catalogms.service.ChangeCatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/catalog")
public class ChangeCatalogItemController {

    private final ChangeCatalogItem changeCatalogItem;

    public ChangeCatalogItemController(ChangeCatalogItem changeCatalogItem) {
        this.changeCatalogItem = changeCatalogItem;
    }

    @PutMapping("/{itemId}")
    public ItemCardResponse handle(@PathVariable Long itemId, @RequestBody @Valid NewItemRequest newItemRequest) {
        return changeCatalogItem.handle(itemId, newItemRequest);
    }
}
