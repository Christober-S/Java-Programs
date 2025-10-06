package com.christober.learning.collection;

import java.util.ArrayDeque;

public class ArrDeque {
    //Implements methods which are available in queue and dequeue Interfacce
    static void main() {
        //FIFO (Queue)
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        //Insertion
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(5);
        arrayDequeAsQueue.addLast(10);


        System.out.print("Queue Elements are: ");
        arrayDequeAsQueue.forEach((Integer val) ->System.out.print(val+" "));
        System.out.println();

        //Deletion
        int element = arrayDequeAsQueue.removeFirst();
        System.out.print("Queue Elements are after removal: ");
        arrayDequeAsQueue.forEach((Integer val) ->System.out.print(val+" "));

        System.out.println();
        //LIFO (Stack)
        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst(5);
        arrayDequeAsStack.addFirst(10);

        System.out.print("Stack elements are: ");
        arrayDequeAsStack.forEach((Integer val) ->System.out.print(val+" "));
        System.out.println();
        //Deletion
        int revElement = arrayDequeAsStack.removeFirst();
        System.out.print("Stack elements are after removal: ");
        arrayDequeAsStack.forEach((Integer val) ->System.out.print(val+" "));
    }
}
