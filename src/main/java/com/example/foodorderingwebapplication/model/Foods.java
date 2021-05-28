package com.example.foodorderingwebapplication.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Foods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foods_id;
    private String foods_name;

    @ManyToMany
    @JoinTable(name = "foods_orders", joinColumns = @JoinColumn(name = "foods_id"), inverseJoinColumns = @JoinColumn(name = "orders_id"))
    private Set<Orders> orders;


    //Getters and Setters

    public Long getFoods_id() {
        return foods_id;
    }

    public void setFoods_id(Long foods_id) {
        this.foods_id = foods_id;
    }

    public String getFoods_name() {
        return foods_name;
    }

    public void setFoods_name(String foods_name) {
        this.foods_name = foods_name;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }
}
