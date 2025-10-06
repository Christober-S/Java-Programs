package com.christober.learning.recursionprograms;

public class Factorial {
    static void main() {
        System.out.println("Factorial: "+factorial(5));
    }
    static long factorial(int n) {
        if (n == 0) return 1;        // base case
        return n * factorial(n - 1); // recursive case
    }

}
