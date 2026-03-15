package com.assignemnt.ttaluri.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data //setters and getters
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id //to determine that this is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //to auto assign ID number to each item in sequence
    private int id;

    private String itemName;
    private double itemPrice;
    private int quantity;
}

    //no args constructor
    /*public Item() {
    }

    //all args constructor
    public Item(int id, String itemName, double itemPrice, int quantity) {
        this.id = id;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public Item(int id, String itemName, double itemPrice) {
        this.id = id;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    //Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   }
*/
