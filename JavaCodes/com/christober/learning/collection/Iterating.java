package com.christober.learning.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Iterating {
    static void main() {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        //Using Iterator
        System.out.println("Iterating the values using iteration method");
        Iterator<Integer> valuesIterator = values.iterator();
        while(valuesIterator.hasNext()){
            int val = valuesIterator.next();
            System.out.println(val);
            if(val == 3)
                valuesIterator.remove();
        }

        System.out.println("Iterating the values using for-each loop");
        for (var val : values) {
            System.out.println(val);
        }

        System.out.println("testing for each method");
        values.forEach((Integer val) ->System.out.println(val));
    }
}
