package com.christober.learning.methods;

public class SumOfOddDigits {
    public static void main(String[] args) {
        System.out.println(sumOddDigits(2345));

    }
    public static int sumOddDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rem % 2 != 0) {
                sum += rem;
                System.out.println("Odd digit "+rem);
            } else {
                System.out.println("Even digit "+rem);
            }
            n = n / 10;
        }
        System.out.println("Sum of odd digits ");
        return sum;
    }
}


