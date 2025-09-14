package FOP;

import java.util.Scanner;

public class DesSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String sort = "";
        for (int i = 9; i >=0 ; i--) {
            int temp = num;
            while (temp != 0) {
                int rem = temp % 10;
                if (rem == i) {
                    sort = sort + rem;
                }
                temp /= 10;
            }
        }
        System.out.println(sort);
        System.out.println("Hwllo"+'d');
        System.out.println(true);
    }
}
