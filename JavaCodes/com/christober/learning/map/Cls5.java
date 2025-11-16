package christober.learning.map;

public class Cls5 {
    // they find the most frequent in an integer array
    static void main() {
        int[] arr = {1, 3, 2, 3, 4, 1, 3, 2, 1, 1};
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxCount = 0;
        int mostFrequent = arr[0];
        for (java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        System.out.println("Most frequent element: " + mostFrequent + " (occurs " + maxCount + " times)");
    }
}
