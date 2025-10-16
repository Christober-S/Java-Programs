package christober.learning.collection.hashsetpgms;

public class Cls2 {
    //Hashset of string . remove one element and display the updated hashset
    static void main() {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Mango");
        System.out.println("Original HashSet: " + set);
        set.remove("Banana");
        System.out.println("Updated HashSet after removing 'Banana': " + set);
    }
}
