package christober.learning.collection;
import java.util.*;
public class StringReversel {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Bazana");
        list.add("Cherry");
        list.add("Avocado");
        list.add("Elderberry");
        List<String> list2 = new ArrayList<>();
//        for(String s : list){
//            list2.add(new StringBuilder(s).reverse().toString());
//        }
//        System.out.println(list2);
        // another method
        for (String s : list) {
            StringBuilder rev = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                rev.append(s.charAt(i));
            }
            list2.add(rev.toString());
        }
        System.out.println(list2);
    }
}
