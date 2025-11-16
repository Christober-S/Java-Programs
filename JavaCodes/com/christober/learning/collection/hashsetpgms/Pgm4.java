package christober.learning.collection.hashsetpgms;
import java.util.*;
public class Pgm4 {
    //String to char list and store in list
    public static void main(String[] args) {
        String str = "programming";
        ArrayList<Character> charList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            charList.add(c);
        }
        System.out.println("Character List: " + charList);
    }
}
