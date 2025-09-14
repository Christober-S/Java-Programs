import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        System.out.println("Enter the numbers");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int last = arr[arr.length - 1];

        System.out.print(arr[arr.length - 1]+" ");

        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
