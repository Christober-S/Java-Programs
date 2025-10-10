package com.christober.learning.collection;
import java.util.ArrayList;
import java.util.List;
public class Pgm2 {
    static void main() {
        List<Integer> list = new ArrayList();
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
        int sum  = 0;
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                System.out.print(integer+" ");
                sum += integer;
            }
        }
        System.out.println();
        System.out.println("The sum is : "+sum);
    }
}
