import java.util.Scanner;

public class Flight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        switch (price){
            default:
                System.out.println("No availablity of  ticket");
            case 5000:
                System.out.println("Economy class");
                break;
            case 10000:
                System.out.println("Business Class");
                break;
            case 15000:
                System.out.println("Premium Class");
                break;
        }
    }
}
