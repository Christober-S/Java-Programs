package com.christober.learning.recursionprograms;

public class ReverseString {
    static void main() {
        String str = "Hello";
        System.out.println(reverse(str));
    }
    static String reverse(String input) {
        if (input.equals(""))
            return "";
        return reverse(input.substring(1)) +  input.charAt(0);
    }
}
