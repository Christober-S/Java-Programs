import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int n = scanner.nextInt();
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        System.out.println(product);
    }
}
