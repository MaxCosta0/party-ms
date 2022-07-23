package br.com.maxley.catalogms.service;

import br.com.maxley.catalogms.controller.ItemCardResponse;
import br.com.maxley.catalogms.repository.CatalogRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

    private final CatalogRepository catalogRepository;

    private final ModelMapper modelMapper;

    public CatalogService(CatalogRepository catalogRepository, ModelMapper modelMapper) {
        this.catalogRepository = catalogRepository;
        this.modelMapper = modelMapper;
    }

    public Page<ItemCardResponse> paginatedCatalog(Pageable pageable) {

        return catalogRepository.findAll(pageable).map(item ->
                modelMapper.map(item, ItemCardResponse.class)
        );
    }
}
