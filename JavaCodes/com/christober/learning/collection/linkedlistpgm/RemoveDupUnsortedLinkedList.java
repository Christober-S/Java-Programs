package christober.learning.collection.linkedlistpgm;
import java.util.LinkedList;
import java.util.ListIterator;
public class RemoveDupUnsortedLinkedList {
    //Write a program to remove duplicates from unsorted linked list of integers
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

        // Without temporary buffer: in-place O(n^2) using two iterators
        removeDuplicatesNoBuffer(list);
        System.out.println("Without buffer (in-place): " + list);
        // How would you solve this problem if a temporary buffer is not allowed?
        // Answer: Use two pointers (current and runner) and remove duplicates in-place.
    }

    // In-place duplicate removal without using extra buffer; runs in O(n^2) time, O(1) extra space
    static <T> void removeDuplicatesNoBuffer(LinkedList<T> list) {
        if (list == null || list.size() < 2) return;
        ListIterator<T> current = list.listIterator();
        while (current.hasNext()) {
            T currVal = current.next();
            ListIterator<T> runner = list.listIterator(current.nextIndex());
            while (runner.hasNext()) {
                if (currVal == null ? runner.next() == null : currVal.equals(runner.next())) {
                    runner.remove();
                }
            }
        }
    }
}
