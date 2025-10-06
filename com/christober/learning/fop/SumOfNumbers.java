package com.christober.learning.fop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int sum=0;
        for (int i = n; i<=m; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
