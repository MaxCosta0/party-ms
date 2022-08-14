package br.com.maxley.catalogms.controller;

import br.com.maxley.catalogms.service.RemoveItemFromCatalog;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/catalog")
public class RemoveItemFromCatalogController {

    private final RemoveItemFromCatalog removeItemFromCatalog;

    public RemoveItemFromCatalogController(RemoveItemFromCatalog removeItemFromCatalog) {
        this.removeItemFromCatalog = removeItemFromCatalog;
    }

    @DeleteMapping("/{itemId}")
    public void handle(@PathVariable Long itemId) {
        removeItemFromCatalog.handle(itemId);
    }
}
