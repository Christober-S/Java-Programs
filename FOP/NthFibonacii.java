import java.util.Scanner;

public class NthFibonacii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = a+b;
            a = b;
            b = sum;
        }
        System.out.println(a);
    }
}
