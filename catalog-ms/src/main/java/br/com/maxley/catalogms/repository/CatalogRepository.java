package br.com.maxley.catalogms.repository;

import br.com.maxley.catalogms.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository<Item, Long> {
}
