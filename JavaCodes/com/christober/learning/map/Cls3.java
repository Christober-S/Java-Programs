package christober.learning.map;

public class Cls3 {
    //count the occurrence of string
    static void main() {
        String str = "abracadabra";
        java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
