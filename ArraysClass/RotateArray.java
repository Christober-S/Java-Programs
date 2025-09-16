package ArraysClass;
import java.util.Arrays;
import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Enter number of positions to rotate the array:");
        int n = sc.nextInt();
        int len = arr.length;
        int[] rotatedArr = new int[len];
        for (int i = 0; i < len; i++)
            rotatedArr[(i + len - n % len) % len] = arr[i];
        System.out.println("Array after rotation:");
        System.out.println(Arrays.toString(rotatedArr));
    }
}
