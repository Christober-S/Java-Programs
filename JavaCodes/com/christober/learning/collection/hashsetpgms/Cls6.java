package christober.learning.collection.hashsetpgms;

public class Cls6 {
    //create two hashset of integer and display common elements
    static void main() {
        java.util.HashSet<Integer> set1 = new java.util.HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        java.util.HashSet<Integer> set2 = new java.util.HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        set1.retainAll(set2);
        System.out.println("Common elements: " + set1);
    }
}
