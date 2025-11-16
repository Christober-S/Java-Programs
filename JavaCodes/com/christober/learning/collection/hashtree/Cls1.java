package christober.learning.collection.hashtree;

public class Cls1 {
    //SubSet Operations: Given a TreeSet of Double values, write a program to extract a subset of elements
    // within a specified range (e.g., all numbers between 18.0 and 50.0, exclusive of 50.0) using the subset()thod and print the resulting Set.
    static void main() {
        java.util.TreeSet<Double> treeSet = new java.util.TreeSet<>();
        treeSet.add(10.5);
        treeSet.add(25.3);
        treeSet.add(40.7);
        treeSet.add(55.2);
        treeSet.add(70.1);

        // Extracting subset between 18.0 and 50.0 (exclusive of 50.0)
        java.util.SortedSet<Double> subset = treeSet.subSet(18.0, 50.0);
        System.out.println(subset);
    }
}
