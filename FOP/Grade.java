import java.util.Scanner;

public class Grade {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        int marks = scanner.nextInt();

        if (marks > 90)
        {
            System.out.println("A grade");
        }
        else if (marks > 80)
        {
            System.out.println("B grade");
        }
        else if (marks > 70)
        {
            System.out.println("C grade");
        }
        else if (marks > 60 )
        {
            System.out.println("D grade");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
