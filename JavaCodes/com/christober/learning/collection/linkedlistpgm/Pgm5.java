package christober.learning.collection.linkedlistpgm;

import java.util.LinkedList;

import static com.christober.learning.fop.ClassProgram.isPalindrome;

public class Pgm5 {
    // Write a program to print all the palaindrome in a linked list
    static void main() {
        // Your code here
        LinkedList<String> list = new LinkedList<>();
        list.add("madam");
        list.add("hello");
        list.add("racecar");
        list.add("world");
        list.add("level");
        System.out.println("Original List: " + list);
        System.out.print("Palindromes in the list: ");
        for (String str : list) {
            if (isPalindrome(str)) {
                System.out.print(str + " ");
            }
        }
    }
    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
