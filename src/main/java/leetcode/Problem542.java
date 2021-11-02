package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(99.48)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem542 {
    private static final int NONE = Integer.MAX_VALUE/2;
    
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (mat[r][c] > 0) {
                    mat[r][c] = 1 + Math.min(c > 0 ? mat[r][c - 1] : NONE, r > 0 ? mat[r - 1][c] : NONE);
                }
            }
        }
        for (int r = n - 1; r >= 0; r--) {
            for (int c = m - 1; c >= 0; c--) {
                if (mat[r][c] > 0) {
                    mat[r][c] = Math.min(mat[r][c],
                        1 + Math.min(c < m - 1 ? mat[r][c + 1] : NONE, r < n - 1 ? mat[r + 1][c] : NONE));
                }
            }
        }
        return mat;
    }
}
