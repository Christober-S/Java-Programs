package christober.learning.collection.hashsetpgms;

public class Pgm2 {
    //WAP to remove the duplicate elements from the array using hashset
    static void main() {
        int[] arr = {1, 2, 3, 2, 4, 1};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates using HashSet:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
