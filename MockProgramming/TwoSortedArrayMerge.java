package MockProgramming;

import java.util.Arrays;

public class TwoSortedArrayMerge {
    static void main() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        System.out.println(Arrays.toString(merged));
    }
}
