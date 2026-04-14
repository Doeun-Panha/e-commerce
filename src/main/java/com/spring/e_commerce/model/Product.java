package com.spring.e_commerce.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    @Column(columnDefinition = "NVARCHAR(MAX)")
    private String description;
    private String imageUrl;
    private int stockQuantity;
    private int lowStockThreshold;

    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public double getPrice(){return price;}
    public void setPrice(double price){this.price=price;}

    public String getDescription(){return description;}
    public void setDescription(String description) {this.description = description;}

    public String getImageUrl() {return imageUrl;}
    public void setImageUrl(String imageUrl) {this.imageUrl = imageUrl;}

    public int getStockQuantity(){return stockQuantity;}
    public void setStockQuantity(int stockQuantity){this.stockQuantity=stockQuantity;}

    public int getLowStockThreshold(){return lowStockThreshold;}
    public void setLowStockThreshold(int lowStockThreshold){this.lowStockThreshold=lowStockThreshold;}
}
