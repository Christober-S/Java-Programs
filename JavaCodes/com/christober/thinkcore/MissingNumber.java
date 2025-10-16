package christober.thinkcore;

public class MissingNumber {
    static void main() {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int missingNumber = total - sum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
