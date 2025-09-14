import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int start=sc.nextInt();
        int end =sc.nextInt();
        for (int i = end; i >= start; i--) {
            if (palani(i)) {
                System.out.println("it is prime " + i);
            } else {
                System.out.println("it is not a prime " + i);
            }
        }
    }
    static boolean palani(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}