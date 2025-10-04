package MockProgramming;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();  // input string
        sc.close();

        boolean isPangram = true;
        for (char c = 'a'; c <= 'z'; c++) {
            if (!str.contains(String.valueOf(c))) {
                isPangram = false;
                break;
            }
        }

        if (isPangram)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
    }
}
