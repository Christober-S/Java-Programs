package FOP;

import java.util.Scanner;

public class NonFibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        printNonFibo(range);
    }

    public static void printNonFibo(int n) {
        int a = 0;
        int b = 1;

        System.out.println("Non-Fibonacci numbers up to " + n + ":");

        while (b <= n) {
            int nextFib = a + b;

            // Print all numbers between b and nextFib (exclusive)
            for (int i = b + 1; i < nextFib && i <= n; i++) {
                System.out.print(i + " ");
            }

            // Move to the next Fibonacci numbers
            a = b;
            b = nextFib;
        }
    }
}
