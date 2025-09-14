package FOP;

import java.util.Scanner;

public class ClassProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s  =strongNumber(n);
        int p = isPalindrome(m);
        if (s == p){
            System.out.println("Both are Same");
        }
        else {
            System.out.println("Not Strong and Palindrome");
        }
    }

    public static int isPalindrome(int n) {
        int temp = n;
        int sum = 0;
        while (temp != 0){
            int rem = temp % 10;
            sum = sum *  10 + rem;
            temp = temp / 10;
        }
        return sum;
    }

    public static int strongNumber(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum+=fact(rem);
            num = num/10;
        }
        return sum;
    }
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
