import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = {1, 2, 3, 4, 93, 203, 293, 32, 5};
        int max = 0;
        int secondLargest = 0;
        for (int i = 0; i < num.length; i++){
            if (num[i] > max) {
                max = num[i];
            }
            
        }
        System.out.println("The maximum number is: " + max);
    }
}
