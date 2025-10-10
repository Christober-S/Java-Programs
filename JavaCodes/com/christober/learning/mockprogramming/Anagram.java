package christober.learning.mockprogramming;
public class Anagram {
    static void main() {
        String str = "Hello";
        String str2 = "oelHl";
    }
    static boolean isAnagram(String str, String str2) {
        if(str.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[256];
        for(int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        for(int count : charCount) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }
}