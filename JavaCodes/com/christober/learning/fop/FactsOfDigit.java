package com.christober.learning.fop;

public class FactsOfDigit {
    public static void main(String[] args) {
        factorial(123);
    }

    public static void factorial(int n){
        while (n > 0){
            int rem = n % 10;
            System.out.println("Factorial of "+rem+" is :"+fact(rem));
            n /= 10;
        }
    }
    public static int fact(int n){
        if (n == 0){
           return 0;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
