import java.util.Scanner;

public class MtoPowerN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            pow *= n;
        }
        System.out.println(pow);
    }
}
