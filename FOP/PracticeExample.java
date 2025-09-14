import java.util.Random;
import java.util.Scanner;

public class PracticeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 100: ");
        Random r = new Random();
        int n = r.nextInt(100);
        for(int i= 0; i<= 100; i++){
            int guess = sc.nextInt();
            if(guess == n){
                System.out.println("You guessed it right!: "+n);
                break;
            } else if (guess > n) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Your guess is too low, try again.");
            }
        }
        System.out.println(n);


    }
}
