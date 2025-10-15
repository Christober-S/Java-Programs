package christober.learning.collection.hashsetpgms;

import java.util.HashSet;

public class Pgm1 {
    static void main() {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1); // Duplicate, will not be added
        set.add(2); // Duplicate, will not be added
        // HashSet automatically handles duplicates
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        System.out.println(set);
    }
}
