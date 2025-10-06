import java.util.Scanner;

public class NIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0;
        double num;
        char op;

        System.out.print("Enter first number: ");
        result = sc.nextDouble(); // Start with the first number

        while (true) {
            System.out.print("Enter operator (+, -, *, /) or 'q' to quit: ");
            op = sc.next().charAt(0); // Get operator

            if (op == 'q' || op == 'Q') {
                break; // Exit loop if user enters 'q'
            }

            System.out.print("Enter next number: ");
            num = sc.nextDouble();

            switch (op) {
                case '+':
                    result += num;
                    break;
                case '-':
                    result -= num;
                    break;
                case '*':
                    result *= num;
                    break;
                case '/':
                    if (num == 0) {
                        System.out.println("Error: Division by zero!");
                        continue; // Skip this iteration
                    }
                    result /= num;
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue; // Skip this iteration
            }

            System.out.println("Current Result: " + result);
        }

        System.out.println("Final Result: " + result);
        sc.close();
    }
}
