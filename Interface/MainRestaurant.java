package Interface;
import java.util.Scanner;
public class MainRestaurant {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------Welcome to the swiggy application--------");
        System.out.println("Please choose according to your preference");
        System.out.println("1. Fast Food Restaurant");
        System.out.println("2. Dinning Food Restaurant");
        switch (input.nextInt()) {
            case 1:
                FastFood f =  new FastFood();
                f.orderConfirmed();
                f.foodPreparation();
                f.readyForPickup();
                break;
            case 2:
                DinningRestaurant d = new DinningRestaurant();
                d.orderConfirmed();
                d.foodPreparation();
                d.readyForPickup();
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
