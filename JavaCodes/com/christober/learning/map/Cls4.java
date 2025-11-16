package christober.learning.map;

public class Cls4 {
    // find the non repeating character in string using map
    static void main() {
        String str = "swiss";
        java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println("First non-repeating character: " + c);
                return;
            }
        }
        System.out.println("No non-repeating character found");
    }
}
