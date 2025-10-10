package com.christober.learning.exceptionhandling.Exceptions;
public class PrintStackTraceDemo {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (Exception e) {
            e.printStackTrace();  // prints full stack trace
        }
    }

    static int divide(int a, int b) {
        return a / b; // will throw ArithmeticException
    }
}
