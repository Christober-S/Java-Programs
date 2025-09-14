//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ArrayRotate {
//    public static void main(String[] args) {
//
//        int[] arr = {1,2,3,4,5};
//        int n = arr.length;
//
//        for (int i = 0; i < arr.length; i++){
//            n = n-1;
//            arr[i] = arr[n];
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}



import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
