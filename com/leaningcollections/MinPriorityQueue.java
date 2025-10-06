package com.leaningcollections;

import java.util.PriorityQueue;

public class MinPriorityQueue {
    public static void main() {

        // min priority queue, used to solve problems of min heap
        // Internally it uses heap so it will be stored
        // In the order of 1 2 8 5
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        // lets print all the values
        minPQ.forEach((Integer val) ->System.out.println(val));

        //remove top elements from the PQ and print
        while (!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println("remove from top: "+val);
        }
    }
}
