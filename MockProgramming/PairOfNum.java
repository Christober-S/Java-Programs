package MockProgramming;

public class PairOfNum {
    static void main() {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int num = 6;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == num){
                    System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
