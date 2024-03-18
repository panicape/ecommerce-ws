package es.panicape.ecommercews.persistence;

import es.panicape.ecommercews.model.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * PriceRepository to handle prices queries
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@Repository
public interface IPriceRepository extends CrudRepository<PriceEntity, Integer> {

    // Methods

    /**
     * findPriceByProductId
     *
     * @param prodId the id
     * @return the price
     */
    List<PriceEntity> findPriceByProdId(Integer prodId);

    /**
     * findPriceByProdIdAndBrandId
     *
     * @param prodId the product Id
     * @param brandId the brand Id
     * @return the price List
     */
    List<PriceEntity> findPriceByProdIdAndBrandId(Integer prodId, Integer brandId);
}
