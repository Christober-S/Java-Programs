package christober.learning.collection.hashsetpgms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cls1 {
    // Create a hashset and add elements to it
    static void main() {
        Set<Integer> list = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        System.out.println(list);
    }
}
