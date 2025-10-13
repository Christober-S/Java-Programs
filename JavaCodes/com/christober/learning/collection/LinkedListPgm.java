package christober.learning.collection;
import java.util.LinkedList;
public class LinkedListPgm {
    static void main() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add("Hello");
        list.add(2.5);
        list.add('A');
        list.add(true);
        list.add(3);
        list.add(4.0f);
        System.out.println(list);
        list.addFirst("First");
        list.addLast("Last");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.contains("Hello"));
        System.out.println(list.indexOf(3));
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());

    }
}
