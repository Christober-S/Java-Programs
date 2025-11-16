package christober.learning.map;

public class Cls7 {
    //sort a hashmap bye kwys using treeemap
    static void main() {
        java.util.HashMap<Integer, String> map = new java.util.HashMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");
        System.out.println("Original HashMap: " + map);
        java.util.TreeMap<Integer, String> sortedMap = new java.util.TreeMap<>(map);
        System.out.println("Sorted TreeMap: " + sortedMap);
    }
}
