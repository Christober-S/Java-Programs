package com.christober.jdks.jit;

public class ExampleJIT {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 1; i <= 100000000 ; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();

        System.out.println("Sum: " + sum);
        System.out.println("Time taken: " + (end - start) + " ms");

    }
}
