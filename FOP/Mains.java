package FOP;
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your age:");
        int age  = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();

        System.out.println("Your age: "+age);
        System.out.println("Your Name: "+name);
    }
}
