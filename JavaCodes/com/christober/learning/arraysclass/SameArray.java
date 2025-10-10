package com.christober.learning.arraysclass;
// SameArray.java
public class SameArray {
    public static boolean areSame(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) return false;
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}