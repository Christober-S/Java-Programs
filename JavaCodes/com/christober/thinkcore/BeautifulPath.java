package christober.thinkcore;

public class BeautifulPath {
    //Beautiful Path
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];
        int value = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = value++;
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if ((i + j) % 2 != 0) {
                    matrix[i][j] = value++;
                }
            }
        }

        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%3d ", num);
            }
            System.out.println();
        }
    }
}
