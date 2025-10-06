package com.christober.learning.fop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range =  sc.nextInt();
        fiboSeries(range);
    }
    public static void fiboSeries(int n){
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 1; a <= n; i++) {
            System.out.print(a+" ");
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}
