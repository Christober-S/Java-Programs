package ArraysClass;

public class SumOfPrime {
    public static void main(String[] args) {
        int a[] = {1, 2, 3,4 ,5};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(isPrime(a[i])){
                sum += a[i];
            }
        }
        System.out.println("The sum of prime elements are: "+sum);
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
