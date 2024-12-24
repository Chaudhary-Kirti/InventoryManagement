package com.inventory.InventoryManagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Data// in place of above all we can just use @data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String name;

    int price;

    int quantity;

    String description;


//    public Item() {//we can remove this because we are using @NoArgsConstructor from lombok
//    }

//    public Item(int id, String name, int price, String description) {//we can remove this because we are using @AllArgsConstructor from lombok
//        this.id = id;
//        this.name = name;
//        this.price = price;
//        this.description = description;
//    }

//    public int getId() {//we can remove these because we are using @getter, @setter from lombok
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
}
