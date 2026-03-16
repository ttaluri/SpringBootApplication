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
    private Integer id;

    private String itemName;
    private double itemPrice;
    private Integer quantity;
}
