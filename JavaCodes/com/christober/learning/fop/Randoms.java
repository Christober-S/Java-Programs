import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100);
        System.out.println("Random number is: " + n);
    }
}
