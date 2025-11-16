package christober.learning.collection.hashtree;

import java.util.Iterator;

public class Pgm3 {
    //Removing Elements: Write a Java program to create a TreeSet of Integer values, add same plements, then remove a specific element using remove(), and finally remove the shallest and largest elements using pollFirst() and polliast().
    // Print the TreeSet after each removal
    static void main() {
        java.util.TreeSet<Integer> treeSet = new java.util.TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

//        Iterable

        System.out.println("Original TreeSet: " + treeSet);

        // Removing a specific element
        treeSet.remove(30);
        System.out.println("After removing 30: " + treeSet);

        // Removing the smallest element
        Integer smallest = treeSet.pollFirst();
        System.out.println("After removing smallest element (" + smallest + "): " + treeSet);

        // Removing the largest element
        Integer largest = treeSet.pollLast();
        System.out.println("After removing largest element (" + largest + "): " + treeSet);
    }
}
