package christober.learning.collection;
import java.util.*;

public class ArrayListToArrayList {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(9);
        list.add(6);
        list.add(5);
        List <Integer> list1 = new ArrayList<>(); // Using the default constructor of ArrayList
        List <Integer> list2 =new ArrayList<>(list); // Using the constructor of ArrayList
        list1.addAll(list); // Using the addAll() method of ArrayList
        Collections.sort(list1); // Sorting the list1
        Collections.sort(list2); // Sorting the list2
        System.out.println(list1);
        System.out.println(list2);
    }
}
