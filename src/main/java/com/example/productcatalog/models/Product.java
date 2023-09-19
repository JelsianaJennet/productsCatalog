package com.example.productcatalog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Product extends  BaseModel{

    private String title; //name
    private String description;
    private String image;
    // P : C ->
    // 1:1
    // M:1
    // M:1
    @ManyToOne
    private Category category;
    private double price;


}
