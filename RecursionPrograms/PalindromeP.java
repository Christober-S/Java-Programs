package RecursionPrograms;
public class PalindromeP {
    static void main() {
        String str = "malayalam";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)) {
            System.out.println("Palindrome");
        }
    }
}
