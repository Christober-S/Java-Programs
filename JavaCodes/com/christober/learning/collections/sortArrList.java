package christober.learning.collections;
import java.util.*;
public class sortArrList {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(4);
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
