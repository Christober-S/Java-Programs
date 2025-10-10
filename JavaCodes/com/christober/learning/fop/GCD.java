package com.christober.learning.fop;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(gcd(num1,num2));

    }

    static int gcd(int num1,int num2){
        int i;

        if (num1 < num2){
            i = num1;
        }
        else {
            i = num2;
        }
        for (i = i; i>1; i--)
        {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
