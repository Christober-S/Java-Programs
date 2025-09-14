package ArraysClass;

import java.util.Scanner;

public class PalindromeAndPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int m = 10;
        int primeV = 0;
        int palindromeV = 0;


        int primeCount = 0;
        for (int i = 2; i <= Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                primeV = i;
                primeCount++;
            }
            if (primeCount == n) {
                break;
            }
        }

        int palindromeCount = 0;
        for (int j = 1; j <= Integer.MAX_VALUE; j++) {
            if (isPalindrome(j)) {
                palindromeV = j;
                palindromeCount++;
            }
            if (palindromeCount == m) {
                break;
            }
        }

        System.out.println("The " + n + "th prime is: " + primeV);
        System.out.println("The " + m + "th palindrome is: " + palindromeV);

        if (primeV == palindromeV) {
            System.out.println("Both palindrome and prime.");
        } else {
            System.out.println("Not equal.");
        }
    }

    public static boolean isPalindrome(int n) {
        int temp = n, sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum * 10 + rem;
            temp /= 10;
        }
        return sum == n;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
