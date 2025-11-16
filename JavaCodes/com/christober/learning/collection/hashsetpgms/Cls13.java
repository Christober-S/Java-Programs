package christober.learning.collection.hashsetpgms;
import java.util.*;
public class Cls13 {
    //to check whether two arrays have at least one element in common using hashSet
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 6, 7, 8, 9};

        boolean result = haveCommonElement(arr1, arr2);
        if (result) {
            System.out.println("The two arrays have at least one element in common.");
        } else {
            System.out.println("The two arrays do not have any elements in common.");
        }
    }
    public static boolean haveCommonElement(int[] arr1, int[] arr2) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                return true;
            }
        }

        return false;
    }
}
