import java.util.Scanner;

public class Printss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }
}
