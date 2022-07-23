package br.com.maxley.catalogms.controller;

import br.com.maxley.catalogms.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/items")
    public Page<ItemCardResponse> catalogList(@Valid Pageable pageable) {
        return catalogService.paginatedCatalog(pageable);
    }
}
