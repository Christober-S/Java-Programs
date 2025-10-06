package com.christober.projects.FoodDeliveryApp;

public class Briyani extends Foods{
    public Briyani(String name, double price) {
        super(name, price);
        this.price = price;
        this.name = name;
    }
    public void extraRaita() {
        this.price += 1.5;
    }
    public void extraPeice(){
        this.price += 1.5;
    }
    public void add100gKabab(){
        this.price += 3.0;
    }
}
