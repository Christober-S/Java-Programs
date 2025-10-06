package com.christober.learning.mockprogramming;

import java.util.Arrays;

public class ZeroAtLast {
    static void main() {
        int [] arr = {1, 2, 0, 3, 8, 0, 3, 4, 3, 0, 6};
        int index = 0;
        for(int num: arr){
            if(num != 0)
                arr[index++] = num;
        }
        while(index < arr.length){
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
