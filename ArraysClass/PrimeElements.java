package ArraysClass;
import java.util.Scanner;
public class PrimeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
//        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Prime numbers in the array");
        for (int i : arr){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
