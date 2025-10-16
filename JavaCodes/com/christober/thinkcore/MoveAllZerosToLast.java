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
    }
}
