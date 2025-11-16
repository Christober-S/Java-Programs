package christober.learning.collection.list;
import java.util.LinkedList;
import java.util.List;
public class TwoListAreEqual {
    static void main(String[] args) {
        java.util.List<String> list1 = new java.util.ArrayList<>();
        java.util.List<String> list2 = new java.util.ArrayList<>();
        LinkedList<String> list3 = new LinkedList<>();
        list3.add("Hello");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");
        System.out.println("Are the two lists equal? " + isSame(list1, list2));
    }
    public static boolean isSame(List<String> list1, List<String> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
