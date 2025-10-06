package com.christober.learning.fop;

import java.util.Scanner;

public class NonFibos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a = 0, b = 1, sum = 1;
        for (int i = 1; i <= n; i++) {
            if (i == sum){
                a = b;
                b = sum;
                sum = a + b;
            }
            else
                System.out.print(i+" ");
        }
    }
}
