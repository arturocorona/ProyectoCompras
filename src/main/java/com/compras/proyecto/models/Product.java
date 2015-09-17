package com.compras.proyecto.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * Clase/entidad modelo de la tabla products.
 * @author Arturo Corona
 */
@Entity
@Table(name = "products")
public class Product {

    private Long product_id;
    private String name;
    private Integer description;
    private String unitPrice;
    private String image;
    
    public Product() {
    }

    public Product(Long product_id, String name, Integer description, String unitPrice, String image) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.image = image;
    }
    
    /**
     * @return the product_id
     */
    public Long getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public Integer getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(Integer description) {
        this.description = description;
    }

    /**
     * @return the unitPrice
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

}