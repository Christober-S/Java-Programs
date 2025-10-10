import java.util.Scanner;

public class Mansi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        String name;
        String place;

        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter place: ");
        place = sc.nextLine();

        System.out.println("your age: "+ age);
        System.out.println("your name: "+ name);
        System.out.println("your place: "+ place);

    }
}
