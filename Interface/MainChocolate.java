package Interface;
import java.util.Scanner;
public class MainChocolate {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Chocolate Shop");
        System.out.println("Available Chocolates: \n1. Dairy Milk\n2. Hasley");
        System.out.println("Choose a which Chocolate You Want");
        int ch = sc.nextInt();
        if (ch == 1) {
            DairyMilk dm = new DairyMilk();
            dm.chocolate();
        }
        else if (ch == 2) {
            Hasley h = new Hasley();
            h.chocolate();
        }
        else{
            System.out.println("Invalid chocolate choice.");
        }
    }
}
