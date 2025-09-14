import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int n = 10;
        int i = 1;
        int next = 0;
        while (i<=n) {
            System.out.print(a+" ");
            next = a + b;
            a = b;
            b = next;
            i++;
        }
    }
}
