package christober.learning.collection;
import java.util.*;
public class MaxndMin {
    static void main() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int max = Collections.max(list);
        int min = Collections.min(list);
        int max1 = list.get(0);
        int min1 = list.get(0);
        for(Integer val : list){
            if(val > max1){
                max1 = val;
            }
            if(val < min1) {
                min1 = val;
            }
        }
        System.out.println("Max value in the list is: " + max);
        System.out.println("Min value in the list is: " + min);
        System.out.println("Max value in the list is: " + max1);
        System.out.println("Min value in the list is: " + min1);
    }
}
