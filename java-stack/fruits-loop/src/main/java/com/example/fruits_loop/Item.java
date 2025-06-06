package com.example.fruits_loop;

public class Item {
    // MEMBER VARIABLES
    private String name;
    private double price;
    // CONSTRUCTOR
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // As always, don't forget to generate Getters and Setters!
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
