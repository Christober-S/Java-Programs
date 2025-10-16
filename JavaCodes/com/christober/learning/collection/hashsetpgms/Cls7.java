package christober.learning.collection.hashsetpgms;

public class Cls7 {
    // WAP to remove all elements from a hashset and confirm it is empty
    static void main() {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Mango");
        System.out.println("Original HashSet: " + set);
        set.clear();
        System.out.println("HashSet after clearing: " + set);
        System.out.println("Is the HashSet empty? " + set.isEmpty());
    }
}
