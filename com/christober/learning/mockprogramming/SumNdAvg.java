package com.christober.learning.mockprogramming;

public class SumNdAvg {
    static void main() {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
