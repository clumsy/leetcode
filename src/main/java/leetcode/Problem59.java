package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int k = 1, max = n*n, i = 0, j = 0, di = 0, dj = 1; k <= max; k++, i += di, j += dj) {
            matrix[i][j] = k;
            if (matrix[(i + di + n)%n][(j + dj + n)%n] > 0) {
                int tmp = di;
                di = dj;
                dj = -tmp;
            }
        }
        return matrix;
    }
}
