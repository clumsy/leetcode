package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.PREFIX_SUM)
@BeatsPercent(94.88)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1314 {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        for (int r = 0; r < m; ++r) {
            for (int c = 0; c < n; ++c) {
                mat[r][c] += c > 0 ? mat[r][c - 1] : 0;
                mat[r][c] += r > 0 ? mat[r - 1][c] : 0;
                mat[r][c] -= r > 0 && c > 0 ? mat[r - 1][c - 1] : 0;
            }
        }
        int[][] answer = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                answer[i][j] =
                    + mat[Math.min(m - 1, i + k)][Math.min(n - 1, j + k)]
                    - (j > k ? mat[Math.min(m - 1, i + k)][j - k - 1] : 0)
                    - (i > k ? mat[i - k - 1][Math.min(n - 1, j + k)] : 0)
                    + (i > k && j > k ? mat[i - k - 1][j - k - 1] : 0);
            }
        }
        return answer;
    }
}
