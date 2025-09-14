package ArraysClass;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =  new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i : arr){
            if(isPalindrome(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static boolean isPalindrome(int n){
        int temp = n;
        int sum = 0;
        while (temp != 0){
            int rem = temp % 10;
            sum = sum *  10 + rem;
            temp = temp / 10;
        }
        if(sum == n){
            return true;
        }
        return false;
    }
}
