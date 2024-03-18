package es.panicape.ecommercews.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


/**
 * ProductEntity
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@Getter
@Setter
@Entity
@Table(name = "PRODUCT")
public class ProductEntity {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PROD_ID")
    private Integer id;

    /** Name */
    @Column(name = "NAME")
    private String name;

    /** dateCreate */
    @Column(name = "DATE_CREATE")
    private String dateCreate;

    /** dateUpdate */
    @Column(name = "DATE_UPDATE")
    private String dateUpdate;

}
