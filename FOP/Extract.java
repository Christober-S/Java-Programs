public class Extract {
    public static void main(String[] args) {
        int n = 40585;
        int num = n;
        int result = 0;
        while (n > 0) {
            int rem = n % 10;
            int fact = 1;
            for (int i = rem; i >= 1; i--) {
                fact *= i;
            }
            result = result + fact;
            n /= 10;
        }
        if (num == result) {
            System.out.println("Strong Number: " + result);
        } else {
            System.out.println("Not Strong Number: " + result);
        }
    }

}