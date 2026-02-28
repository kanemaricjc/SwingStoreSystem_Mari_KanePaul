/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingstoresystem;

/**
 *
 * @author Acer
 */
public class DataService {
    private Information[] inventory = new Information[4];
    private Information[] transactions = new Information[50];
    
    private int inventoryCount = 0;
    private int transactionCount = 0;
    
    public DataService() {
        addProduct(new Information("Rice", 30.0, 20));
        addProduct( new Information( "Sugar", 25.0, 20 ));
        addProduct( new Information( "Coffee", 10.0, 20 ));
        addProduct( new Information( "Milk", 60.0, 20 ));
    }
    
    
    
    public void addProduct(Information item) {
        if (inventoryCount < inventory.length) {
            inventory[inventoryCount] = item;
            inventoryCount++;
        }
    }
    
    public Information[] getInventory() {
        return inventory;
    }
    
    public int getInventoryCount(){
        return inventoryCount;
    }
    
    public void reduceStock(String productName, int amount) {
        for (int i= 0; i < inventoryCount; i++) {
        if (inventory[i].getProductName().equals(productName)) {
            int newQty = inventory[i].getQuantity() - amount;
            inventory[i].setQuantity(newQty);
            break;
        }
        }
    }
    
    public void addTransaction(Information sale) {
        if (transactionCount < transactions.length) {
            transactions[transactionCount] = sale;
            transactionCount++;
        }
    }
    
    public Information[] getTransactions() {
        return transactions;
    }
    
    public int getTransactionCount() {
        return transactionCount;
    }
    
}
