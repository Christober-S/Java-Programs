import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        reverseString(arr);
    }
    public static void reverseString(char[] s) {
        for (int i = s.length-1; i>=0; i--){
            System.out.print(s[i]);
        }
    }
}