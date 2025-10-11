package christober.learning.collection;
import java.util.*;
public class LastInOf {
    static void main() {
        List <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(4);
        list.add(3);
        int index = list.lastIndexOf(3);
        System.out.println("Last index of 3: " + index);
    }
}
