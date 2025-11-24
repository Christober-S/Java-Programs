package christober.learning.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    static void main() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Iterator iterator = list.iterator();
        System.out.println();
        while (iterator.hasNext()) {
            Integer i = (Integer) iterator.next();
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
