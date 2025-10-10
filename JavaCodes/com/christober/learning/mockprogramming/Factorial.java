package com.christober.learning.mockprogramming;
import java.util.Scanner;
public class Factorial {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find factorial:");
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + " is: " + new Factorial().factorial(number));
    }
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public int fact(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
