package com.compras.proyecto.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Clase/entidad modelo de la tabla orders.
 * @author Arturo Corona
 */
@Entity
@Table(name = "orders")
public class Order {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Long order_id;
    private String status;
    private Long user_id;
    private Date order_date;
    private Date delivery_date;
    
    public Order() {
    }

    public Order(Long order_id, String status, Long user_id, Date order_date, Date delivery_date) {
        this.order_id = order_id;
        this.status = status;
        this.user_id = user_id;
        this.order_date = order_date;
        this.delivery_date = delivery_date;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the user_id
     */
    public Long getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the order_date
     */
    public Date getOrder_date() {
        return order_date;
    }

    /**
     * @param order_date the order_date to set
     */
    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    /**
     * @return the delivery_date
     */
    public Date getDelivery_date() {
        return delivery_date;
    }

    /**
     * @param delivery_date the delivery_date to set
     */
    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }
    
}
