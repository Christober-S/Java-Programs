package com.christober.learning.stringprograms;
import java.util.Scanner;
public class AllRotationString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("all possible rotations are as follows: ");
        for (int i = 0; i <= str.length()-1 ; i++) {
            String substr = str.substring(i)+str.substring(0, i);
            System.out.println(substr);
        }
    }
}
