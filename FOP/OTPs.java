import java.util.Random;
import java.util.Scanner;

public class OTPs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int otp = rand.nextInt(1000); // OTP from 0 to 999
        int attempts = 3;
        int count = 0;

        while (count < attempts) {
            int num = sc.nextInt();

            if (num == otp) {
                System.out.println("OTP is correct");
                break;
            } else {
                count++;
                if (count < attempts) {
                    System.out.println("Incorrect OTP, try again. You have " + (attempts - count) + " attempts left.");
                } else {
                    System.out.println("Incorrect OTP, no attempts left. The correct OTP was: " + otp);
                }
            }
        }
    }
}
