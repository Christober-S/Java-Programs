package christober.thinkcore;

public class MoveAllZerosToLast {
    //Move all zeros to the end of the array
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }

        System.out.println("Array after moving all zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // using two pointer approach
        System.out.println();
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] == 0 && arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] != 0) {
                left++;
            } else if (arr[right] == 0) {
                right--;
            }
        }
    }
}
