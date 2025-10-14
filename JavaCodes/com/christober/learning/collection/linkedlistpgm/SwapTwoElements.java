package christober.learning.collection.linkedlistpgm;

import java.util.Collections;
import java.util.LinkedList;


public class SwapTwoElements {
    static void main() {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);

        Collections.swap(list, 1, 0);
        System.out.println(list);
    }
}
