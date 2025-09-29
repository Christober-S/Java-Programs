package StringPrograms;
import java.util.Scanner;
public class TwoStringsRotationsOfEachOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string 1: ");
        String str = sc.nextLine();

        System.out.println("Enter a string 2: ");
        String str1 = sc.nextLine();

        // First check length
        if (str.length() != str1.length()) {
            System.out.println("No, \"" + str1 + "\" is not a rotation of \"" + str + "\"");
            return;
        }

        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            String rotated = str.substring(i) + str.substring(0, i);
            if (str1.equals(rotated)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes, \"" + str1 + "\" is a rotation of \"" + str + "\"");
        } else {
            System.out.println("No, \"" + str1 + "\" is not a rotation of \"" + str + "\"");
        }

        sc.close();
    }
}
