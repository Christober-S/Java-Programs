package com.christober.learning.stringprograms;

public class EvenIndexChar {
    static void main() {
        String str = "abc";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]+" ");
            }
        }
    }
}
