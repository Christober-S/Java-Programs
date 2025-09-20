package StringPrograms;

public class ReverseString {
    static void main() {
        String str = "CHRISTOBER";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
