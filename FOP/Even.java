import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(i+" ");
            i+=1;
        }
    }
}
