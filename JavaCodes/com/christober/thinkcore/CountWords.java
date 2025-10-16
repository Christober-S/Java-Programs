package christober.thinkcore;

public class CountWords {
    //Count words in a string
    public static void main(String[] args) {
        String str = "Hello, welcome to the world of Java programming.";
        String[] words = str.split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}
