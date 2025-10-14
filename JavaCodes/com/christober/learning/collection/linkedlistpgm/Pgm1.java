package christober.learning.collection.linkedlistpgm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Pgm1 {
    static void main() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous()+" ");
        }
    }
}
