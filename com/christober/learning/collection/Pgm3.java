package learning.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pgm3 {
    static void main() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add("Christo");
        list.add(true);
        list.add(3.5);
        list.add('J');
        list.add('A');
        list.add("VA");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if(obj instanceof Integer){
                System.out.println(obj);
            }
        }
    }
}
