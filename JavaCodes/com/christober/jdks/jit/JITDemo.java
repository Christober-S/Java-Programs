package com.christober.jdks.jit;

public class JITDemo {
    public static void main(String[] args) {
        long start = System.nanoTime();

        long sum = 0;
        for (int j = 0; j < 5000; j++) {
            sum += runCalculation();
        }

        long end = System.nanoTime();
        System.out.println("Final Sum: " + sum);
        System.out.println("Time taken: " + (end - start) / 1_000_000 + " ms");
    }

    static long runCalculation() {
        long result = 0;
        for (int i = 0; i < 1_000_000; i++) {
            result += (i * i) % 7;
        }
        return result;
    }
}
