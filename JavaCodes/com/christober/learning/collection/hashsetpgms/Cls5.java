package christober.learning.collection.hashsetpgms;

public class Cls5 {
    //Hashset and print the tota no of elements present in the hashset
    static void main() {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Mango");
        System.out.println("Total number of elements in the HashSet: " + set.size());
    }
}
