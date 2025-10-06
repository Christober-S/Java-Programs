package com.christober.learning.exceptionhandling.Errors;

public class RecursionForStackOverFlow {
    static void main() {
        System.out.println("main");
        RecursionForStackOverFlow obj = new RecursionForStackOverFlow();
        obj.main();
    }
}
