package christober.learning.collection.listiterator;

import java.util.EventListener;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    static void main() {
        LinkedList list = new LinkedList();
        list.add("Chris");
        list.add("Java");
        list.add("Software");
        list.add("Development");
        System.out.println(list);
        ListIterator ltr = list.listIterator();
        while (ltr.hasNext()){
            String s = (String) ltr.next();
            if (s.equals("Java")){
                ltr.set("Python");
            }
            else if( s.equals("Development")){
                ltr.add("Engineer");
            }
            else if( s.equals("Chris")){
                ltr.remove();
            }
        }
        System.out.println(list);
    }
}
