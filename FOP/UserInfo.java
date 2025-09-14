import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your place: ");
        String place = scanner.nextLine();

        System.out.println("\nHello " + name + "! You are " + age + " years old and from " + place + ".");
    }
}