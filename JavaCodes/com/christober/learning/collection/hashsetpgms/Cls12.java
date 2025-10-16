package christober.learning.collection.hashsetpgms;

import java.util.HashSet;

public class Cls12 {
    static void main() {
        String input = "programming";
        HashSet<Character> charSet = new HashSet<>();
        String result = new String();

        for (char c : input.toCharArray()) {
            if (charSet.add(c)) {
                result+=c;
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result.toString());
    }
}
