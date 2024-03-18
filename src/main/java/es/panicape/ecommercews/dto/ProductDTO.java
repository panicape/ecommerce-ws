package es.panicape.ecommercews.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

/**
 * ProductDTO
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@Getter
@Setter
public class ProductDTO {

    /** id */
    private Integer id;

    /** Name */
    private String name;

    /** dateCreate */
    private String dateCreate;

    /** dateUpdate */
    private String dateUpdate;

}
