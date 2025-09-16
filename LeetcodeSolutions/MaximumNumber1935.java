package LeetcodeSolutions;
public class MaximumNumber1935 {
//    Example 1:
//
//    Input: text = "hello world", brokenLetters = "ad"
//    Output: 1
//    Explanation: We cannot type "world" because the 'd' key is broken.
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] broken = new boolean[26];
        for (char c : brokenLetters.toCharArray()) {
            broken[c - 'a'] = true;
        }

        String[] words = text.split(" ");
        int count = 0;

        for (String word : words) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (broken[c - 'a']) {
                    canType = false;
                    break;
                }
            }
            if (canType) count++;
        }

        return count;
    }

    static void main() {
        MaximumNumber1935 solution = new MaximumNumber1935();
        String text = "hello world";
        String brokenLetters = "ad";
        int result = solution.canBeTypedWords(text, brokenLetters);
        System.out.println(result); // Output: 1
    }
}
