package christober.learning.collection;

import java.util.ArrayList;

public class UpperCaseToLowerCase {
    //convert all upper case to lower case
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Bazana");
        list.add("Cherry");
        list.add("Avocado");
        list.add("Elderberry");
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("All upper case to lower case");
        for (String s : list){
            list1.add(s.toLowerCase());
        }
        System.out.println(list1);
    }
}
