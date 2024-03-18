package es.panicape.ecommercews.persistence;

import es.panicape.ecommercews.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * IProductRepository
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@Repository
public interface IProductRepository extends CrudRepository<ProductEntity, Integer> {
}
