package com.christober.learning.mocktest;

public class RemoveSpecificCharFromString {
    static void main() {
        String str = "Hello World";
        char charToRemove = 'o';
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != charToRemove) {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
