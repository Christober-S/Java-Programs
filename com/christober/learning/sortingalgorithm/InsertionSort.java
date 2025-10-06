package com.christober.learning.sortingalgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];      // element to be placed
            int j = i - 1;
            // Shift elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place key in its correct position
            arr[j + 1] = key;
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
