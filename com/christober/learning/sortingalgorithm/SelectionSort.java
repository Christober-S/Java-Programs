package com.christober.learning.sortingalgorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1,29, 43, 90, 23, 21, 2, 38};
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the current index is the minimum
            int minIndex = i;

            // Find the minimum element in remaining unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("The sorted array is: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
