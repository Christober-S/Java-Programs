package Methods;

public class SumOfTheNumbers {
    public static void main(String[] args) {
        System.out.println(sum(1, 10));
    }
    public static int sum(int a, int b) {
        int sum = 0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        return sum;
    }
}
