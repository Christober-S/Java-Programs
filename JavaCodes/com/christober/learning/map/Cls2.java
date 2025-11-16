package christober.learning.map;

public class Cls2 {
    //to count the frequency of each word in a given string using hashmap
    static void main() {
        String str = "hello world hello everyone";
        String[] words = str.split(" ");
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
}
