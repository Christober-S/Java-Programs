import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age =  input.nextInt();
        String name =  input.next();
        String place = input.nextLine();
        int favoriteNumber = input.nextInt();

        System.out.println("Your age is "+age);
        System.out.println("Your name is "+name);
        System.out.println("Your place is "+place);
        System.out.println("Your favorite number is "+favoriteNumber);

        String fav_book = input.nextLine();
        System.out.println("Your favourite book is "+fav_book);
        int score =  input.nextInt();
        System.out.println("Your score is "+score);

    }
}
