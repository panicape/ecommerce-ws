package es.panicape.ecommercews.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


/**
 * BrandEntity
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@Getter
@Setter
@Entity
@Table(name = "BRAND")
public class BrandEntity {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BRAND_ID")
    private Integer id;

    /** name */
    @Column(name = "NAME")
    private String name;

    /** dateCreate */
    @Column(name = "DATE_CREATE")
    private String dateCreate;

    /** dateUpdate */
    @Column(name = "DATE_UPDATE")
    private String dateUpdate;

}
