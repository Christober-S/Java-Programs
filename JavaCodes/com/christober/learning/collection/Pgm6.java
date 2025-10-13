package christober.learning.collection;

import java.util.ArrayList;

public class Pgm6 {
    //write pgm to print all the names starting with alphabet 'A'from the array list of strings.
    static void main() {
        ArrayList <String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Bazana");
        list.add("Cherry");
        list.add("Avocado");
        list.add("Elderberry");
        System.out.println("Names starting with 'A' or 'a:");
        for (String name : list) {
            if (name.startsWith("A") || name.startsWith("a")) {
                System.out.println(name);
            }
        }
    }
}
