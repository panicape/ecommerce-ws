package es.panicape.ecommercews.persistence;

import es.panicape.ecommercews.model.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BrandEntity
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Integer> {
}
