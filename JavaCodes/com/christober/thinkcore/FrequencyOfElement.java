package christober.thinkcore;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 7};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("The frequency of element: " + arr[i] + " is: " + count);
        }
    }
}
