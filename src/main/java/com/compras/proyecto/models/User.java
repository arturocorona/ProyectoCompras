package com.compras.proyecto.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * Clase/entidad modelo de la tabla users.
 * @author Arturo Corona
 */
@Entity
@Table(name = "users")
public class User {
    
    private Long user_id;
    private String name;
    private String last_name;
    private Integer phone;
    private String address;
    private String email;
    private String type;

    public User(){
    }
    
    public User(Long user_id, String name, String last_name, Integer phone, String address, String email, String type) {
        this.user_id = user_id;
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.type = type;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
