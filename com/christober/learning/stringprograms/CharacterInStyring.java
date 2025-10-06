package com.christober.learning.stringprograms;

import java.util.Scanner;

public class CharacterInStyring {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: "   );
        String str = sc.nextLine();
        System.out.println("Enter the character to check: ");
        char ch = sc.next().charAt(0);
        if(isPalindrome(str, ch)){
            System.out.println("Character is present in a string");
        }
        else{
            System.out.println("Character is not present in a string");
        }
    }
    private static boolean isPalindrome(String str, char ch) {
        boolean flag = false;
        for (int j = 0; j < str.length(); j++) {
            if(str.charAt(j) ==  ch) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
