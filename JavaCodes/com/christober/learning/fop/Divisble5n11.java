import java.util.Scanner;

public class Divisble5n11 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num % 5 == 0 && num % 11 == 0)
        {
            System.out.println("The given number is divisible by 5 and 11");
        }
        else{
            System.out.println("The given number is not divisible by 5 and 11");
        }
    }
}
