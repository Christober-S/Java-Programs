package christober.learning.collection.hashtree;

public class Pgm4 {
    //Checking for Element Existence: Create a TreeSet of String elements.
    // Write a program to check if a particular String is present in the TreeSet using the contains() method and print the boolean result.
    static void main() {
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");

        // Checking for existence of a particular String
        String searchString = "Cherry";
        boolean exists = treeSet.contains(searchString);
        System.out.println("Does the TreeSet contain '" + searchString + "'? " + exists);
    }
}
