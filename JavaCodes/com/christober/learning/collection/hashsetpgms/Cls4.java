package christober.learning.collection.hashsetpgms;

public class Cls4 {
    //Hashset and check it is empty beofre and after adding elements
    static void main() {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        System.out.println("Is the HashSet empty? " + set.isEmpty());
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println("Is the HashSet empty after adding elements? " + set.isEmpty());
    }
}
