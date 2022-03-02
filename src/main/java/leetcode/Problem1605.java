package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.CONSTRUCTIVE)
@BeatsPercent(80.30)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1605 {
    public int[][] restoreMatrix(int[] row, int[] col) {
        int m = row.length, n = col.length;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = Math.min(row[i], col[j]);
                row[i] -= matrix[i][j];
                col[j] -= matrix[i][j];
            }
        }
        return matrix;
    }
}
