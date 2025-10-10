package christober.learning.collection;

import java.util.*;

public class BasicMethods {
    static void main() {
        List<Integer> values = new ArrayList<>();

        // Adding elements
        values.add(2);
        values.add(3);
        values.add(4);

        // size
        System.out.println("size: " + values.size());

        // isEmpty
        System.out.println("isEmpty: " + values.isEmpty());

        // contains
        System.out.println("contains 5: " + values.contains(5));

        // add element 5
        values.add(5);
        System.out.println("added 5, contains 5: " + values.contains(5));

        // remove using index
        values.remove(3); // removes element at index 3
        System.out.println("removed using index 3, contains 5: " + values.contains(5));

        // remove using object
        values.remove(Integer.valueOf(3)); // removes element "3"
        System.out.println("removed using object 3, contains 3: " + values.contains(3));

        // Stack
        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);

        // addAll
        values.addAll(stackValues);
        System.out.println("addAll test using containsAll: " + values.containsAll(stackValues));

        // remove one element (7)
        values.remove(Integer.valueOf(7));
        System.out.println("containsAll after removing 1 element: " + values.containsAll(stackValues));

        // removeAll
        values.removeAll(stackValues);
        System.out.println("removeAll (stackValues), contains 8: " + values.contains(8));

        // clear
        values.clear();
        System.out.println("clear: " + values.isEmpty());
    }
}
