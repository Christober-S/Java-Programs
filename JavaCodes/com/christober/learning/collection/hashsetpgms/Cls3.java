package christober.learning.collection.hashsetpgms;

public class Cls3 {
    //program to check if a specific element exists in a hashset
    static void main() {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Mango");
        String elementToCheck = "Orange";
        if (set.contains(elementToCheck)) {
            System.out.println(elementToCheck + " exists in the HashSet.");
        } else {
            System.out.println(elementToCheck + " does not exist in the HashSet.");
        }
    }
}
