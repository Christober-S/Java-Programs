import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and exponent
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        System.out.println(base + " raised to the power " + exponent + " is: " + result);
        sc.close();
    }
}
