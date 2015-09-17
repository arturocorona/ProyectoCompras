package com.compras.proyecto.models;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * Clase/entidad modelo de la tabla orders.
 *
 * @author Arturo Corona
 */
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long order_id;
    private String status;
    @ManyToOne
    private User user;
    private Date order_date;
    private Date delivery_date;
    @OneToMany(targetEntity = OrderDetail.class, mappedBy = "order", 
            orphanRemoval = true, cascade = CascadeType.ALL)
    private List<OrderDetail> details;

    public Order() {
    }

    public Order(Long order_id, String status, User user, Date order_date,
            Date delivery_date, List<OrderDetail> details) {
        this.order_id = order_id;
        this.status = status;
        this.user = user;
        this.order_date = order_date;
        this.delivery_date = delivery_date;
        this.details = details;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }

    public List<OrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetail> details) {
        this.details = details;
    }

}
