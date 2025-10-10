package christober.learning.collection;

import java.util.*;

public class ArrListClear {
    static void main() {
        // Clear method is used to remove all the elements from the list
        // and it returns void
        // After calling clear method the size of the list will be 0
        // and the list will be empty
        // Example:
         List<Integer> list = new ArrayList<>();
         list.add(100);
         list.add(200);
         list.add(300);
         System.out.println("Size before clear: " + list.size());
         list.clear();
         System.out.println("Size after clear: " + list.size());
         if(list.isEmpty()){
             System.out.println("List is empty");
         }
    }
}
