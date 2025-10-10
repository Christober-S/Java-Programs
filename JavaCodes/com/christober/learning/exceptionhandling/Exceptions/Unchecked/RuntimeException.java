package com.christober.learning.exceptionhandling.Exceptions.Unchecked;

public class RuntimeException {
    static void main() {
        method1();
    }
    static void method1() {
        throw new ArithmeticException();
    }
}
