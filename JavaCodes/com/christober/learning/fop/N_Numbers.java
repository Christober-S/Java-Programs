import java.util.Scanner;

public class N_Numbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i<=n; i++){
            ans = ans+i;
        }
        System.out.println("The sum of n natural number is "+ans);
    }
}

