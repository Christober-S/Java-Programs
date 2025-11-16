package christober.learning.map;

public class Cls9 {
    //a program to invert a map(swap key and value)
    static void main() {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        System.out.println("Original Map: " + map);
        java.util.HashMap<Integer, String> invertedMap = new java.util.HashMap<>();
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Inverted Map: " + invertedMap);
    }
}
