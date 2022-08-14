package br.com.maxley.catalogms.controller;

import br.com.maxley.catalogms.model.ItemCardResponse;
import br.com.maxley.catalogms.model.NewItemRequest;
import br.com.maxley.catalogms.service.AddItemToCatalog;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/catalog")
public class AddItemToCatalogController {

    final AddItemToCatalog addItemToCatalog;

    public AddItemToCatalogController(AddItemToCatalog addItemToCatalog) {
        this.addItemToCatalog = addItemToCatalog;
    }

    @PostMapping("/item")
    public ItemCardResponse handle(@RequestBody @Valid NewItemRequest newItemRequest) {
        return addItemToCatalog.handle(newItemRequest);
    }
}
