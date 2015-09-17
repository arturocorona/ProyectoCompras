
package com.compras.proyecto.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * Clase/entidad modelo de la tabla orders_detail.
 * @author Arturo Corona
 */
@Entity
@Table(name = "orders_detail")
public class OrderDetail {
    
    private Long order_id;
    private Long product_id;
    private String quantity;
    private Integer unitPrice;
    
    public OrderDetail() {
    }

    public OrderDetail(Long order_id, Long product_id, String quantity, Integer unitPrice) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    /**
     * @return the order_id
     */
    public Long getOrder_id() {
        return order_id;
    }

    /**
     * @param order_id the order_id to set
     */
    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
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
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the unitPrice
     */
    public Integer getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }
    
}
