package christober.learning.collection.list;
import java.util.*;
public class CountOccurance {
    //count frequency of each char of string. Using HashMap
    public static void main(String[] args) {
        String str = "hello world";
        java.util.HashMap<Character, Integer> charCountMap = new java.util.HashMap<>();
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println("Character frequency: " + charCountMap);
    }
}
