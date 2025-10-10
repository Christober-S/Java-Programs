package com.christober.learning.methods;

public class Sums {
    public static void main(String[] args) {
        System.out.println(sum(123));
    }
    public static int sum(int a) {
        int temp = a;
        int sum = 0;
        while (temp != 0) {
            temp = temp % 10;
            sum += temp;
            temp = temp / 10;
        }
        return sum;
    }
}


