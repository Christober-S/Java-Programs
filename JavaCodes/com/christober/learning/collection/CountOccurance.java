package christober.learning.collection;

import java.util.*;

public class CountOccurance {
    static void main() {
        List <Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(1);


//        int count = Collections.frequency(list, 1);
        int con = 0;
//        System.out.println("Count of 1 in the list is: " + count);
        for(Integer val : list){
            if(val == 1){
                con +=1;
            }
        }
        System.out.println("Count of 1 in the list is: " + con);
    }
}
