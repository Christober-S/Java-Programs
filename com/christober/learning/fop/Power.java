package com.christober.learning.fop;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        long result = 1;
        for (int i = 1; i <= exponent; i++){
            result = result * base;
        }
        System.out.println(result);
    }
}
