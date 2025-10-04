package MockTest;

public class StringToCharArray {
    static void main() {
        String str = "Hello";
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}
