package com.christober.learning.fop;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sum = 1;
        while (num > 0) {
            int rem = num % 10;
            sum = sum * rem;
            num = num / 10;
        }
        System.out.println("The Sum Of Digits: " + sum);
    }
}
