package MockProgramming;

public class DuplicateElement {
    static void main() {
        int [] arr  = {1, 2, 3, 3, 4, 5, 5, 6, 6};
        int j = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length-1];
        System.out.println("Array After Removal: ");
        for (int i = 0; i<j; i++)
            System.out.print(arr[i]+" ");
    }
}
