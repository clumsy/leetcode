package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem48 {
    public void rotate(int[][] matrix) {
        for (int t = 0, n = matrix.length; t < n/2; t++) {
            for (int k = t; k < n - 1 - t; k++) {
                int tmp = matrix[k][n - 1 - t];
                matrix[k][n - 1 - t] = matrix[t][k];
                matrix[t][k] = matrix[n - 1 - k][t];
                matrix[n - 1 - k][t] = matrix[n - 1 - t][n - 1 - k];
                matrix[n - 1 - t][n - 1 - k] = tmp;
            }
        }
    }
}
