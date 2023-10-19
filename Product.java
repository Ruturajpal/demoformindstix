package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private Long id;

    @Column(name = "product_key") // Define the column name explicitly
    private int productKey;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private double price; // Using double for prices with decimals

    @Column
    private String inventory;

    // Constructors, getters, and setters
}
