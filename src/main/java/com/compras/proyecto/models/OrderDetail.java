
package com.compras.proyecto.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * Clase/entidad modelo de la tabla orders_detail.
 * @author Arturo Corona
 */
@Entity
@Table(name = "details")
public class OrderDetail {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long detail_id;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Product product;
    private Integer quantity;
    private Integer unitPrice;
    
    public OrderDetail() {
    }
    
}
