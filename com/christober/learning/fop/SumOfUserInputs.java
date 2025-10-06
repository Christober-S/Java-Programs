package com.christober.learning.fop;

import java.util.Scanner;

public class SumOfUserInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of numbers to be added: ");
        int count = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the "+count+" number ");
        for (int i = 0; i < count; i++) {
            sum = sum + sc.nextInt();
        }
        System.out.println(sum);
    }
}
