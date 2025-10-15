package christober.learning.collection.hashsetpgms;
import java.util.ArrayList;

public class ArrListToHashSet {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        System.out.println("Original ArrayList: " + list);
        // Convert ArrayList to HashSet to remove duplicates
        java.util.HashSet<Integer> set = new java.util.HashSet<>(list);
        System.out.println("After converting to HashSet (duplicates removed): " + set);
    }
}
