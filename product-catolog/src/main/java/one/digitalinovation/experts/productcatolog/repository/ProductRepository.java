package one.digitalinovation.experts.productcatolog.repository;

import one.digitalinovation.experts.productcatolog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
