package com.christober.learning.arraysclass;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSorts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 20, 47, 3, 4, 5,4 , 9, 2, 3, 4, 2};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
