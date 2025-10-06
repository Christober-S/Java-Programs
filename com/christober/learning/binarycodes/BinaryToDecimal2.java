package com.christober.learning.binarycodes;

import java.util.Scanner;

public class BinaryToDecimal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int dec = 0;
        int expo = 1;
        while (bin != 0) {
            int digit = bin % 10;
            if (digit == 1)
                dec = dec + expo;
            else

            bin /= 10;
        }
    }
}
