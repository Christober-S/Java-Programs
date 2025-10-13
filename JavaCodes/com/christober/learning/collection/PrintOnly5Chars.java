package christober.learning.collection;

import java.util.ArrayList;

public class PrintOnly5Chars {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Bazana");
        list.add("Cherry");
        list.add("Avocado");
        list.add("Elderberry");
        System.out.println("Names with exactly 5 characters:");
        for (String name : list) {
            if (name.length() == 5) {
                System.out.println(name);
            }
        }
    }
}
