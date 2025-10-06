package com.christober.learning.collection;

import java.util.ArrayList;
import java.util.List;

public class Pgm1 {
    static void main() {
        List list = new ArrayList();
        list.add(1);
        list.add("Hello");
        list.add(2.5);
        list.add('A');
        list.add(true);
        list.add(3);
        list.add(4.0f);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                System.out.println("Integer: " + list.get(i));
            }
        }
    }
}
