package christober.learning.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListPgm {
    static void main() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(0, 100);
        list1.add(1, 200);
        list1.add(2, 300);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0, 400);
        list2.add(1, 500);
        list2.add(2, 600);

        list1.addAll(2, list2);
        list1.forEach((Integer val) -> System.out.println(val));

        //replaceAll (unary operator)
        list1.replaceAll((Integer val) -> -1 * val);
        System.out.println("After replacing all elements:");
        list1.forEach((Integer val) -> System.out.println(val));

        //sort (comparator)
        list1.sort((Integer val1, Integer val2) -> val1 - val2);
        System.out.println("After sorting the elements:");
        list1.forEach((Integer val) -> System.out.println(val));

        //get (index)
        System.out.println("Element at index 3: " + list1.get(3));

        //set(index, element)
        list1.set(3, 700);
        System.out.println("After setting element at index 3 to 700:");
        list1.forEach((Integer val) -> System.out.println(val));

        //remove(int index)
        list1.remove(3);
        System.out.println("After removing element at index 3:");
        list1.forEach((Integer val) -> System.out.println(val));

        //indexOf (element)
        int index = list1.indexOf(500);
        System.out.println("Index of element 500: " + index);

        ListIterator<Integer> iterator = list1.listIterator(list1.size());
        System.out.println("Traversing the list in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        list1.forEach((Integer val) -> System.out.println(val));

        List<Integer> sublist = list1.subList(1, 4);
        System.out.println("Sublist from index 1 to 4:");
        sublist.forEach((Integer val) -> System.out.println(val));

        sublist.add(-343);
        System.out.println("After adding -343 to the sublist:");
        sublist.forEach((Integer val) -> System.out.println(val));
        System.out.println("Original list after modifying the sublist:");
        list1.forEach((Integer val) -> System.out.println(val));
    }
}
