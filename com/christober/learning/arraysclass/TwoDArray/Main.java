package com.christober.learning.arraysclass.TwoDArray;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int row = sc.nextInt();
        System.out.println("Enter the column size: ");
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
