package christober.learning.collection.hashsetpgms;
import java.util.*;
public class Pgm3 {
    // Convert a arrraylist of name with duplicates into linkedhashset to remove duplicates,
    //then convert back to arraylist and sort in alphabetical order
    public static void main(String[] args) {
        java.util.ArrayList<String> namesList = new java.util.ArrayList<>();
        namesList.add("Christober");
        namesList.add("John");
        namesList.add("Bob");
        namesList.add("Christober");
        namesList.add("David");
        namesList.add("Eve");
        namesList.add("John");

        System.out.println("Original ArrayList: " + namesList);

        LinkedHashSet<String> namesSet = new LinkedHashSet<>(namesList);
        System.out.println("After converting to LinkedHashSet (duplicates removed): " + namesSet);

        ArrayList<String> uniqueNamesList = new ArrayList<>(namesSet);

        Collections.sort(uniqueNamesList);
        System.out.println("Sorted ArrayList without duplicates: " + uniqueNamesList);
    }
}
