package FOP;

public class ToAddTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = -3;
        int c = a; // Start with first number

        if (b > 0) { // If b is positive, increment c b times
            for (int j = 1; j <= b; j++) {
                c++;
            }
        } else { // If b is negative, decrement c |b| times
            for (int j = 1; j <= (-b); j++) {
                c--;
            }
        }

        System.out.println("Sum: " + c);
    }
}
