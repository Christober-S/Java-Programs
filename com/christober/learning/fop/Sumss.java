public class Sumss {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if  (count == 2) {
                System.out.println(i);
            }
        }
    }
}
