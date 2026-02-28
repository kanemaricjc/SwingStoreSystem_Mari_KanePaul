/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingstoresystem;

/**
 *
 * @author Acer
 */
public class Information {
    
    private String product;
    private double price;
    private int quantity;
    
    public Information(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getProductName() {
        return product;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int number) {
        this.quantity = number;
    }
    
    
}
