package christober.learning.map;

public class Cls8 {
    //convert a map to list
    static void main() {
        java.util.HashMap<Integer, String> map = new java.util.HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        java.util.List<java.util.Map.Entry<Integer, String>> list = new java.util.ArrayList<>(map.entrySet());
        System.out.println(list);
    }
}
