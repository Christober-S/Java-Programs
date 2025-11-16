package christober.learning.collection.hashsetpgms;

public class Cls15 {
    //First repeating char from string using hasSet
    public static void main(String[] args) {
        String str = "programming";
        Character result = firstRepeatingCharacter(str);
        if (result != null) {
            System.out.println("The first repeating character is: " + result);
        } else {
            System.out.println("No repeating characters found.");
        }
    }

    public static Character firstRepeatingCharacter(String str) {
        java.util.HashSet<Character> set = new java.util.HashSet<>();
        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }
        return null;
    }
}