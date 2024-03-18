package es.panicape.ecommercews.services;

import es.panicape.ecommercews.model.PriceEntity;
import es.panicape.ecommercews.persistence.IPriceRepository;
import es.panicape.ecommercews.persistence.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;


/**
 * Webservices exposer for prices
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@RestController
@RequestMapping("/price_manager")
public class PricesWS {

    /** price Repository */
    @Autowired
    private IPriceRepository priceRepo;

    /** product Repository */
    @Autowired
    private IProductRepository productRepo;


    // Methods

    /**
     * getAllPricesByProductId
     * @param date the date to be compared
     * @param productId the product Id
     * @param brandId The brandId
     * @return The list of prices
     */
    @GetMapping("/price/{date}/{productId}/{brandId}")
    public List<PriceEntity> getAllPricesByProductId(@PathVariable String date,
                                                         @PathVariable Integer productId,
                                                         @PathVariable Integer brandId) {

        List<PriceEntity> input = priceRepo.findPriceByProdIdAndBrandId(productId, brandId);
        List<PriceEntity>result = new ArrayList<>();
        if (input != null) {
            result = input.stream().filter(priceEntity -> (priceEntity.getStartDate().compareTo(date) > 0 &&
                                    priceEntity.getEndDate().compareTo(date) < 0)).collect(Collectors.toList());
        }

        return result;
    }

    /**
     * getPriceById
     *
     * @param id the price id
     * @return the price dto
     */
    @GetMapping("/price/{id}")
    public Optional<PriceEntity> getPriceById(@PathVariable Integer id) {
        return priceRepo.findById(id);
    }

    /**
     *
     * @return the list of prices
     */
    @GetMapping("/price/all")
    public Iterable<PriceEntity> getAllPrices() {
        return priceRepo.findAll();
    }

    /**
     * getAllPricesByProductId
     *
     * @param productId the product id
     * @return the list of prices
     */
    @GetMapping("/price_by_product/{id}")
    public Iterable<PriceEntity> getAllPricesByProductId(@PathVariable Integer productId) {
        return priceRepo.findPriceByProdId(productId);
    }

}
