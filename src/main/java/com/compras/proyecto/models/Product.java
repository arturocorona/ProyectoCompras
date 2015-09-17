package com.compras.proyecto.models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * Clase/entidad modelo de la tabla products.
 * @author Arturo Corona
 */
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long product_id;
    private String name;
    private Integer description;
    private String unitPrice;
    private String image;
    @OneToMany(targetEntity = OrderDetail.class, mappedBy = "product", 
            orphanRemoval = true, cascade = CascadeType.ALL)
    private List<OrderDetail> orders;
    
    public Product() {
    }

}