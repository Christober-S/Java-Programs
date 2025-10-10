import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }
    }

    // -------------------------------------------------------------------
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}