package com.christober.learning.carpackage;

import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vehicle vehicle;
        System.out.println("1. BIKE\n2. CAR\n3. AUTO");
        switch (input.nextInt()) {
            case 1:
                vehicle = new Bike();
                vehicle.calculateFare(10);
                break;
            case 2:
                vehicle = new Car();
                vehicle.calculateFare(10);
                break;
            case 3:
                vehicle = new Auto();
                vehicle.calculateFare(10);
                break;
        }

    }
}
