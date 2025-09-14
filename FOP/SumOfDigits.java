import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for Sum of Digits : ");
        int num = sc.nextInt();
        System.out.println("The Sum of Digits : " + SumDigits(num));
    }
    public static int SumDigits(int num){
        int sum = 0;
        while(num!=0){
            int rem = num % 10;
            sum = sum + rem;
            num = num/10;
        }
        return sum;
    }
}

