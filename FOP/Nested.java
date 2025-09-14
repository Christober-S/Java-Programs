import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        if  (num1 > num4) {
            if  (num1 > num3) {
                if (num1 > num2) {
                    System.out.println("The maximum number is: " + num1);
                }
                else{
                    System.out.println("The maximum number is: " + num2);
                }
            }
            else{
                System.out.println("The maximum number is: " + num3);
            }
        }
        else{
            System.out.println("The maximum number is: " + num4);
        }
    }
}
