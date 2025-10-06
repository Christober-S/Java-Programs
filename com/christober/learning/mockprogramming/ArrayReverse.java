package com.christober.learning.mockprogramming;

import java.util.Arrays;

public class ArrayReverse {
    static void main() {
        int [] arr = {1, 2, 3, 4, 5};
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        int [] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length-1-i];
        }
        System.out.println();
        System.out.println(Arrays.toString(rev));
    }
}
