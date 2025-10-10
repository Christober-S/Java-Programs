package com.christober.learning.exceptionhandling.Exceptions.UserDefined;

public class Main {
    static void main() {
        try {
            method1();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void method1() throws NewException {
        throw new NewException();
    }
}
