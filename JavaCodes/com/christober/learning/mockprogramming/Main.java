package com.christober.learning.mockprogramming;

public class Main {
    static void main() {
        String s = "Hello, World!";
        String str = s.replaceAll("\\s+", "");
        System.out.println(str);
    }
}
