public class Factors {
    public static void main(String[] args) {
        int num = 100;
        int i = 1;
        while (i<=num){
            if (num % i == 0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
