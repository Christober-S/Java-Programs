package christober.learning.collection.linkedlistpgm;

import java.util.Collections;
import java.util.LinkedList;

public class MergeTwoLinkedListInSorted {
    static void main() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        // Merging two sorted linked lists into a new sorted linked list
        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println("Merged Sorted List: " + list1);
//        LinkedList<Integer> mergedList = mergeSortedLists(list1, list2);
//        System.out.println("Merged Sorted List: " + mergedList);
    }
//    static LinkedList<Integer> mergeSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
//        LinkedList<Integer> merged = new LinkedList<>();
//        int i = 0, j = 0;
//        while (i < list1.size() && j < list2.size()) {
//            if (list1.get(i) <= list2.get(j)) {
//                merged.add(list1.get(i));
//                i++;
//            } else {
//                merged.add(list2.get(j));
//                j++;
//            }
//        }
//        while (i < list1.size()) {
//            merged.add(list1.get(i));
//            i++;
//        }
//        while (j < list2.size()) {
//            merged.add(list2.get(j));
//            j++;
//        }
//        return merged;
//    }
}

