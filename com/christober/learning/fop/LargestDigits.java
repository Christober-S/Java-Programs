import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num =  sc.nextInt();

        int max = 0;
        while(num!=0){
            int rem = num % 10;
            if (max < rem){
                max = rem;
            }
            num = num / 10;
        }
        System.out.println(max);
    }
}
