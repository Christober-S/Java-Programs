package MockTest;

public class FactorsOfNumber {
    static void main() {
        int num = 12;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
