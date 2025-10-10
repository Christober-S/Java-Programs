package christober.learning.collection;

import java.util.*;

public class SpecifiElement {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(900);
        list.add(1000);
        System.out.println("List before removing specific element: " + list);
        // Remove specific element from the list
        int index = list.indexOf(600);
        System.out.println("Index of element 600 is: " + index);
        list.set(index, 650);
        System.out.println("List after updating element 600 to 650: " + list);
        int size = list.size();
        System.out.println("Size of the list is: " + size);
    }
}
