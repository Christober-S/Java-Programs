package MockProgramming;

public class SpecificElement {
    static void main() {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ele = 3;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele) {
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }
}
