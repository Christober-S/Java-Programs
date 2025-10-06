package com.christober.learning.recursionprograms;

public class Palindrome {
    static void main() {
        String str = "javaj";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) return true;
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }
}
