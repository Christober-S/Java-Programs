import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int product = 1;

        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }

        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy Number");
        }
    }
}
