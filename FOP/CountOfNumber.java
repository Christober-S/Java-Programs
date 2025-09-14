package FOP;

import java.util.Scanner;

public class CountOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while (num != 0) {
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
