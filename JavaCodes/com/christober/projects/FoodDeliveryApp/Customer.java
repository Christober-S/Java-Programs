package com.christober.projects.FoodDeliveryApp;

import java.util.Scanner;

public class Customer {
    public static void FinalBill(Foods food) {
        System.out.println("Item: " + food.name);
        System.out.println("Total Price: $" + food.price);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Food Delivery App!");
        System.out.println("Select the food item you want to order:");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Biryani");
        System.out.println("4. Salad");
        int choice = input.nextInt();
        Foods food;
        switch (choice) {
            case 1:
                food = new Burger("Burger", 5.0);
                System.out.println("You selected Burger. Do you want to add extra cheese? (yes/no)");
                String cheeseChoice = input.next();
                if (cheeseChoice.equalsIgnoreCase("yes")) {
                    ((Burger) food).extraCheese();
                }
                System.out.println("Do you want to add extra sauce? (yes/no)");
                String sauceChoice = input.next();
                if (sauceChoice.equalsIgnoreCase("yes")) {
                    ((Burger) food).extraSauce();

                }
                System.out.println("Do you want to make it extra large? (yes/no)");
                String sizeChoice = input.next();
                if (sizeChoice.equalsIgnoreCase("yes")) {
                    ((Burger) food).extraLarge();
                }
                FinalBill(food);
                break;
            case 2:
                food = new Pizza("Pizza", 8.0);
                System.out.println("You selected Pizza. Do you want to add extra cheese? (yes/no)");
                String pizzaCheeseChoice = input.next();
                if (pizzaCheeseChoice.equalsIgnoreCase("yes")) {
                    ((Pizza) food).extraCheese();
                }
                System.out.println("Do you want to add extra veggies? (yes/no)");
                String veggiesChoice = input.next();
                if (veggiesChoice.equalsIgnoreCase("yes")) {
                    ((Pizza) food).extraVeggies();
                }
                System.out.println("Do you want to add extra topping? (yes/no)");
                String toppingChoice = input.next();
                if (toppingChoice.equalsIgnoreCase("yes")) {
                    ((Pizza) food).extraTopping();
                }
                FinalBill(food);
                break;
            case 3:
                food = new Briyani("Briyani", 10.0);
                System.out.println("You selected Briyani. Do you want to add extra raita? (yes/no)");
                String raitaChoice = input.next();
                if (raitaChoice.equalsIgnoreCase("yes")) {
                    ((Briyani) food).extraRaita();
                }
                System.out.println("Do you want to add extra piece? (yes/no)");
                String pieceChoice = input.next();
                if (pieceChoice.equalsIgnoreCase("yes")) {
                    ((Briyani) food).extraPeice();
                }
                System.out.println("Do you want to add 100g kabab? (yes/no)");
                String kababChoice = input.next();
                if (kababChoice.equalsIgnoreCase("yes")) {
                    ((Briyani) food).add100gKabab();
                }
                FinalBill(food);
                break;
            case 4:
                food = new Salad("Salad", 6.0);
                System.out.println("You selected Salad. Do you want to add extra avocado? (yes/no)");
                String avocadoChoice = input.next();
                if (avocadoChoice.equalsIgnoreCase("yes")) {
                    ((Salad) food).extraAvocado();
                }
                System.out.println("Do you want to add extra pineapple? (yes/no)");
                String pineappleChoice = input.next();
                if (pineappleChoice.equalsIgnoreCase("yes")) {
                    ((Salad) food).extraPineapple();
                }
                System.out.println("Do you want to add extra nuts? (yes/no)");
                String nutsChoice = input.next();
                if (nutsChoice.equalsIgnoreCase("yes")) {
                    ((Salad) food).extraNuts();
                }
                FinalBill(food);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid food item.");
                break;
        }
    }
}
