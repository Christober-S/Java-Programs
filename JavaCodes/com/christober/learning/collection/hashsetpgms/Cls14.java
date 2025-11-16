package christober.learning.collection.hashsetpgms;

public class Cls14 {
    //to find the intersection of two arrays using hastSet
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        java.util.HashSet<Integer> intersection = findIntersection(arr1, arr2);
        System.out.println("The intersection of the two arrays is: " + intersection);
    }
    public static java.util.HashSet<Integer> findIntersection(int[] arr1, int[] arr2) {
        java.util.HashSet<Integer> set1 = new java.util.HashSet<>();
        java.util.HashSet<Integer> intersection = new java.util.HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection;
    }
}
