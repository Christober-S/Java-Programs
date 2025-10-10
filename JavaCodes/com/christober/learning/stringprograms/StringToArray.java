package com.christober.learning.stringprograms;

import java.util.Arrays;

public class StringToArray {
    static void main() {
        String str = "abc";
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}
