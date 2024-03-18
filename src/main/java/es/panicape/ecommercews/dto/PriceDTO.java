package es.panicape.ecommercews.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


/**
 * PriceDTO
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@Getter
@Setter
public class PriceDTO {

    /** id */
    private Integer id;

    /** brandId */
    private Integer brandId;

    /** prodId */
    private Integer prodId;

    /** startDate */
    private String startDate;

    /** endDate */
    private String endDate;

    /** priceList */
    private Integer priceList;

    /** priority */
    private Integer priority;

}
