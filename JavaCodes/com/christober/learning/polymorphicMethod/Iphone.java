package com.christober.learning.polymorphicMethod;

public class Iphone extends Product {
    int quantity;

    public Iphone(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double calculatePrice(int cost) {
        return cost * quantity;
    }
}
