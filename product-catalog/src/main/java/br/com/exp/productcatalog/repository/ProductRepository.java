package br.com.exp.productcatalog.repository;

import br.com.exp.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
