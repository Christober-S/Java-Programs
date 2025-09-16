package ArraysClass;

import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
//        Arrays.sort(arr);
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements are: ");
//        for (int i = 0; i < n; i+=2) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(Arrays.toString(arr));

        for(int num: arr){
            if (num % 2 == 0){
                System.out.print(num+" index of "+num+"\n");
            }
        }
//        char [] ch = new char[6];
//        boolean [] b = new boolean[6];
//        short [] s = new short[6];
//        long [] l = new long[6];
//        float [] f = new float[6];
//        double [] d = new double[6];
//        String [] str = new String[6];
//        System.out.println(ch[1]);
//        System.out.println(b[1]);
//        System.out.println(s[1]);
//        System.out.println(l[1]);
//        System.out.println(f[1]);
//        System.out.println(d[1]);
//        System.out.println(str[2]);
    }
}
