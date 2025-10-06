package com.christober.jdks.jit;

public class JITExample {
    public static void main(String[] args) {
        long start = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            compute(i);
        }

        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start)/1_000_000 + " ms");
    }

    static int compute(int x) {
        return (x * x + 3) % 7;
    }
}
