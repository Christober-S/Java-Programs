package MockTest;

public class SortOnlyPositiveNumber {
    static void main() {
        int[] arr = { -1, 3, -2, 5, 4, -6, 2 };
        int n = arr.length;

        // Extract positive numbers
        int[] positiveNumbers = new int[n];
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                positiveNumbers[count++] = num;
            }
        }

        // Sort positive numbers using Bubble Sort
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (positiveNumbers[j] > positiveNumbers[j + 1]) {
                    // Swap
                    int temp = positiveNumbers[j];
                    positiveNumbers[j] = positiveNumbers[j + 1];
                    positiveNumbers[j + 1] = temp;
                }
            }
        }

        // Place sorted positive numbers back into original array
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                arr[i] = positiveNumbers[index++];
            }
        }

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
