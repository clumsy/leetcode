package leetcode;

@BeatsPercent(100)
public class Problem59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int number = 1;
        for (int k = 0; k < (n+1)/2; k++) {
            int last = n - 1 - k;
            if (k == last) {
                matrix[k][k] = number++;
                return matrix;
            }
            for (int i = k; i < last; i++) {
                matrix[k][i] = number++;
            }
            for (int i = k; i < last; i++) {
                matrix[i][last] = number++;
            }
            for (int i = last; i > k; i--) {
                matrix[last][i] = number++;
            }
            for (int i = last; i > k; i--) {
                matrix[i][k] = number++;
            }
        }
        return matrix;
    }
}
