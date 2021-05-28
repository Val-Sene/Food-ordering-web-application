package com.example.foodorderingwebapplication.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orders_id;
    private Long users_id;
    private Long foods_id;
    private Date timestamp;
    private BigDecimal total;
    @ManyToOne
    private Users users;
    @ManyToMany(mappedBy = "orders")
    private Set<Foods> foods;
    //Getters and Setters


    public Long getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(Long orders_id) {
        this.orders_id = orders_id;
    }

    public Long getUsers_id() {
        return users_id;
    }

    public void setUsers_id(Long users_id) {
        this.users_id = users_id;
    }

    public Long getFoods_id() {
        return foods_id;
    }

    public void setFoods_id(Long foods_id) {
        this.foods_id = foods_id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Set<Foods> getFoods() {
        return foods;
    }

    public void setFoods(Set<Foods> foods) {
        this.foods = foods;
    }
}
