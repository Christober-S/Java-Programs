package christober.learning.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPgm {
    static void main() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(0, 100);
        list1.add(1, 200);
        list1.add(2, 300);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0, 400);
        list2.add(1, 500);
        list2.add(2, 600);

        list1.addAll(2, list2);
        list1.forEach((Integer val) -> System.out.println(val));


    }
}
