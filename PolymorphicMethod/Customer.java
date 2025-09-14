package PolymorphicMethod;
import java.util.Scanner;

public class Customer {
    public static void mobile(Product product, int cost) {
        double price = product.calculatePrice(cost);
        System.out.println("Total Price: " + price);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the Mobile Brand:");
        System.out.println("1. Apple\n2. Samsung");
        Product product;
        switch (input.nextInt()) {
            case 1:
                int priceI = 69999;
                System.out.println("The Price of Iphone is: " + priceI);
                System.out.println("Enter quantity:");
                int n = input.nextInt();
                product = new Iphone(n);
                mobile(product, priceI);
                break;

            case 2:
                int priceS = 123999;
                System.out.println("The Price of Samsung is: " + priceS);
                System.out.println("Enter quantity:");
                int m = input.nextInt();
                product = new Samsung(m);
                mobile(product, priceS);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
