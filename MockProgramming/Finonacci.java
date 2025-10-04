package MockProgramming;

import java.util.Scanner;

public class Finonacci {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fibonacci(num);
    }

    static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
