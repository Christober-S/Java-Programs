package christober.learning.collection.linkedlistpgm;

import java.util.ArrayList;
import java.util.LinkedList;

public class Pgm2 {
    //write a program to convert a linked list to arrayList
    static void main() {
        // Your code here
        LinkedList <Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
        ArrayList <Integer> arrayList = new ArrayList<>(linkedList);
        System.out.println(arrayList);
    }
}
