package MockProgramming;

public class ArraySorted {
    static void main() {
        int [] arr = {1, 2, 3, 4, 5, 6};
        boolean sort = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                sort = false;
                break;
            }
        }
        if (sort){
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }
}
