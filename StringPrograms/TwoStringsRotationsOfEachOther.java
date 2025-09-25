package StringPrograms;

import java.util.Scanner;

public class TwoStringsRotationsOfEachOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string 1: ");
        String str = sc.nextLine();
        System.out.println("Enter a string 2: ");
        String str1 = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            String substr = str.substring(i) + str.substring(0, i);
            if (substr.equals(str1)) {
                System.out.println("Yes, \"" + str1 + "\" is a rotation of \"" + str + "\"");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No, \"" + str1 + "\" is NOT a rotation of \"" + str + "\"");
        }
    }
}
