package christober.learning.collection;
import java.util.*;
public class ArrListIteration {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
//        System.out.println("Using for loop:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();
//        System.out.println("In Reverse: ");
//        for (int i = list.size()-1; i>=0 ; i--) {
//            System.out.print(list.get(i)+" ");
//        }
        Iterator<String> it = list.iterator();
        System.out.println("In Forward: ");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("In Reverse: ");
        ListIterator<String> listIt = list.listIterator(list.size());
        while (listIt.hasPrevious()) {
            System.out.print(listIt.previous() + " ");
        }
    }
}
