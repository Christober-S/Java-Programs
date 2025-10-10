public class Facts {
    public static void main(String[] args) {

        int n = 125683;
        while(n>0){
            int fact = 1;
            int rem = n % 10;
            for (int i = rem; i >= 1; i--) {
               fact *= i;
            }
            System.out.println(fact);

        }
    }
}
