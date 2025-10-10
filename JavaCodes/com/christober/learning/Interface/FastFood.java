package com.christober.learning.Interface;

public class FastFood implements Restaurant {
    @Override
    public void orderConfirmed() {
        System.out.println("Order Confirmed");
    }
    @Override
    public void foodPreparation() {
        System.out.println("Food Preparing (Please wait for 10 minutes)");
    }
    @Override
    public void readyForPickup() {
        System.out.println("Ready for Pickup");
    }
}
