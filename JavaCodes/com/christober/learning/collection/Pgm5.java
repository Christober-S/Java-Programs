package christober.learning.collection;

import java.util.ArrayList;
import java.util.List;

public class Pgm5 {
    static void main() {
        // WAP To reverse only alternativative string obj in the arrray list of strings
        // starting with 0 index.
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
        for (int i = 0; i < list.size(); i += 2) {
            String s = list.get(i);
            String rev = "";
            for (int j = s.length() - 1; j >= 0; j--) {
                rev +=s.charAt(j);
            }
            list2.add(rev);
        }
        System.out.println(list2);
    }
}
