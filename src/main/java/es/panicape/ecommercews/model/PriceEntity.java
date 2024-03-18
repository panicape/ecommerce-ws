package es.panicape.ecommercews.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@Getter
@Setter
@Entity
@Table(name = "PRICES")
public class PriceEntity {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "P_ID")
    private Integer id;

    /** brandId */
    @Column(name = "P_BRAND_ID")
    private Integer brandId;

    /** prodId */
    @Column(name = "P_PROD_ID")
    private Integer prodId;

    /** startDate */
    @Column(name = "START_DATE")
    private String startDate;

    /** endDate */
    @Column(name = "END_DATE")
    private String endDate;

    /** priceList */
    @Column(name = "PRICE_LIST")
    private Integer priceList;

    /** priority */
    @Column(name = "PRIORITY")
    private Integer priority;


    // Constructor

    /**
     *
     */
    public PriceEntity() {
    }

    /**
     *
     * @param id the id
     * @param brandId the brand Id
     * @param prodId the product id
     * @param startDate the start Date
     * @param endDate the end Date
     * @param priceList price List
     * @param priority the priority
     */
    public PriceEntity(Integer id, Integer brandId, Integer prodId,
                       String startDate, String endDate, Integer priceList,
                       Integer priority) {
        this.id = id;
        this.brandId = brandId;
        this.prodId = prodId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceList = priceList;
        this.priority = priority;
    }
}
