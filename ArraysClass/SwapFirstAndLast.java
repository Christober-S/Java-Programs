package ArraysClass;

import java.util.Arrays;

public class SwapFirstAndLast {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int last = arr[arr.length-1];
        int first = arr[0];

        arr[0] = last;
        arr[arr.length-1] = first;
        System.out.println(Arrays.toString(arr));
    }
}
