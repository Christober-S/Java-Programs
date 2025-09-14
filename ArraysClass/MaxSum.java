package ArraysClass;

import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int [] arr =  new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int ival = 0;
        int jval = arr.length-1;
        for(int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (arr[i]+arr[j] > max){
                    ival = i;
                    jval = j;
                    max = arr[i]+arr[j];
                }
            }
        }
        System.out.println("Maximum number is "+max+" with index of "+ival+" "+jval);
    }
}
