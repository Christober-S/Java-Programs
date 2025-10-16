package christober.learning.collection.hashsetpgms;

public class Cls10 {
    //wap to check wheather a given element exists in a hashset or not
    static void main() {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Mango");
        String elementToCheck = "Banana";
        if (set.contains(elementToCheck)) {
            System.out.println(elementToCheck + " exists in the HashSet.");
        } else {
            System.out.println(elementToCheck + " does not exist in the HashSet.");
        }
    }
}
