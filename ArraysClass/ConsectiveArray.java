package ArraysClass;
public class ConsectiveArray {
    static void main() {
        int []arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int missing;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                missing = arr[i] + 1;
                System.out.println("Missing number is: " + missing);
                break;
            }
        }
    }
}