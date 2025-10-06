package com.christober.projects.FoodDeliveryApp;

public class Salad extends Foods {
    public Salad(String name, double price) {
        super(name, price);
        this.price = price;
        this.name = name;
    }
    public void extraAvocado() {
        this.price += 2.0;
    }
    public void extraPineapple() {
        this.price += 1.5;
    }
    public void extraNuts() {
        this.price += 3.0;
    }
}

