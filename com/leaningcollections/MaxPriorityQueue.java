package com.leaningcollections;

import java.util.PriorityQueue;

public class MaxPriorityQueue {
    static void main() {
        // max priority queue, used to solve problems of min heap
        // Internally it uses heap so it will be stored
        // In the order of 8 2 5 1
        // Here, we have used comparator
        PriorityQueue<Integer> minPQ = new PriorityQueue<>((Integer a, Integer b) -> b-a);
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

    // Time Complexity for PriorityQueue
    // Add and Offer : 0(logn)
    // Peak : 0(1)
    // Poll and Remove head element: 0(logn)
    // Remove arbitary element: 0(n)
}
