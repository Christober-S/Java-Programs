package MockTest;

public class PalindromeInRange {
    static void main() {
        int start = 10;
        int end = 100;

        for (int num = start; num <= end; num++) {
            int originalNum = num;
            int reversedNum = 0;

            while (originalNum != 0) {
                int digit = originalNum % 10;
                reversedNum = reversedNum * 10 + digit;
                originalNum /= 10;
            }

            if (num == reversedNum) {
                System.out.println(num + " is a palindrome.");
            }
        }
    }
}
