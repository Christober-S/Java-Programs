package com.christober.learning.patterns;

public class PassalsTriangle {
    public static void main(String[] args) {
        int str = 1;
        int spc = 4;
        for (int r = 1; r <=5 ; r++) {
            int n = 1;
            for (int i = 1; i <=spc ; i++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=str ; j++) {
                if (j < (str + 1) / 2) {
                    System.out.print(" "+(n++)+" ");
                }
                else {
                    System.out.print(" "+(n--)+" ");
                }

            }
            System.out.println();
            str+=2;
            spc--;
        }
    }
}
