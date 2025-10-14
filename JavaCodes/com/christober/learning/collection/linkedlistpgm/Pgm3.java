package christober.learning.collection.linkedlistpgm;

import java.util.LinkedList;

public class Pgm3 {
    // Write a program to print the middle element of a linked list of Integers
    static void main() {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int mid = list.size()/2;
        System.out.println("Middle element: " + list.get(mid));
    }
}
