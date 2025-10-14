package christober.learning.collection.linkedlistpgm;
import java.util.LinkedList;
import java.util.ListIterator;
public class Pgm4 {
    //Write a program to remove duplicates from a unsorted linked list of integers
    static void main() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        System.out.println("Original List: " + list);

        // With temporary buffer (aux list)
        LinkedList<Integer> newList = new LinkedList<>();
        for (Integer i : list) {
            if (!newList.contains(i)) {
                newList.add(i);
            }
        }
        System.out.println("With buffer (aux list): " + newList);

        // Without temporary buffer: in-place O(n^2) using index + runner iterator (no CME)
        removeDuplicatesNoBuffer(list);
        System.out.println("Without buffer (in-place): " + list);
        // How would you solve this problem if a temporary buffer is not allowed?
        // Answer: Use two pointers (current by index, runner by iterator) and remove duplicates in-place.
    }

    // In-place duplicate removal without using extra buffer; runs in O(n^2) time, O(1) extra space
    static <T> void removeDuplicatesNoBuffer(LinkedList<T> list) {
        if (list == null || list.size() < 2) return;
        for (int i = 0; i < list.size(); i++) {
            T currVal = list.get(i); // O(n) for LinkedList, but overall remains O(n^2)
            ListIterator<T> runner = list.listIterator(i + 1);
            while (runner.hasNext()) {
                T nextVal = runner.next();
                if (currVal == null ? nextVal == null : currVal.equals(nextVal)) {
                    runner.remove();
                }
            }
        }
    }
}

