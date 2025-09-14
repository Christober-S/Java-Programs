package FOP;

import java.util.Scanner;

public class FiboInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int next;
        int arr [] = new int[n];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = a;
            next = a + b;
            a = b;
            b = next;
        }

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }

    }
}
