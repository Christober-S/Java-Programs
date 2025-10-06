package com.christober.learning.binarycodes;

import java.util.Scanner;

public class BinaryCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Store the binary representation
        String binary = "";

        // Handle the special case when decimal is 0
        if (decimal == 0) {
            binary = "0";
        } else {
            int num = decimal;
            while (num > 0) {
                binary = (num % 2) + binary; // prepend remainder
                num = num / 2; // integer division
            }
        }

        // Output the result
        System.out.println("Binary representation: " + binary);

        sc.close();
    }
}
