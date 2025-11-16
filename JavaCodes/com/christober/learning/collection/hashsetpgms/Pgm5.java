package christober.learning.collection.hashsetpgms;
import java.util.*;
public class Pgm5 {
    // Given a sentence and linkedhashset of words (the, is, an a), remove them from ur sentence while preserving the order of other words.
    public static void main(String[] args) {
        String sentence = "This is the example of an simple sentence for the purpose of testing a program";
        LinkedHashSet<String> wordsToRemove = new LinkedHashSet<>();
        wordsToRemove.add("the");
        wordsToRemove.add("is");
        wordsToRemove.add("an");
        wordsToRemove.add("a");

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!wordsToRemove.contains(word)) {
                result.append(word).append(" ");
            }
        }

        System.out.println("Original Sentence: " + sentence);
        System.out.println("After removing specified words: " + result.toString().trim());
    }
}
