public class PerfectSquare {
    public static void main(String[] args) {
        int number = 49; // try changing this to other numbers

        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is NOT a perfect square.");
        }
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 0) return false;

        for (int i = 1; i <= num / 2; i++) {
            if (i * i == num) {
                return true;
            } else if (i * i > num) {
                break;
            }
        }

        return num == 0 || num == 1; // 0 and 1 are perfect squares
    }
}
