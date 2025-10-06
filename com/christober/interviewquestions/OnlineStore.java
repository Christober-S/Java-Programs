package com.christober.interviewquestions;

import java.util.Scanner;

public class OnlineStore extends Payment{
    public OnlineStore(double amount) {
        super(amount);
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Online Store");
        System.out.println("We accept the Below 6payment methods");
        System.out.println("1. Credit Card\n2. Bank Transfer\n3. Paytm");
        OnlineStore obj;
        switch(input.nextInt()){
            case 1:
                System.out.println("You have choosed the credit card");
                System.out.println("Please enter the amount you want to pay");
                double amount = input.nextDouble();
                obj  = new OnlineStore(amount);
                obj.setAmount(amount);
                System.out.println("Amount you have paid: "+obj.getAmount());

                break;
            case 2:
                System.out.println("You have choosed the bank transfer");
                System.out.println("Please enter the amount you want to pay");
                double amount2 = input.nextDouble();
                obj  = new OnlineStore(amount2);
                obj.setAmount(amount2);
                System.out.println("Amount you have paid: "+obj.getAmount());
                break;
            case 3:
                System.out.println("You have choosed the paytm");
                System.out.println("Please enter the amount you want to pay");
                double amount3 = input.nextDouble();
                obj  = new OnlineStore(amount3);
                obj.setAmount(amount3);
                System.out.println("Amount you have paid: "+obj.getAmount());
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
