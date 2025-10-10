package com.christober.learning.polymorphicMethod;

public class Samsung extends Product {
    int quantity;

    public Samsung(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double calculatePrice(int cost) {
        return cost * quantity;
    }
}
