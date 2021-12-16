package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(98.45)
@TimeComplexity(worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] max_row = new int[n];
        int[] max_col = new int[n];
        for (int r = 0; r < n; ++r) {
            for (int c = 0; c < n; ++c) {
                max_row[r] = Math.max(max_row[r], grid[r][c]);
                max_col[c] = Math.max(max_col[c], grid[r][c]);
            }
        }
        int count = 0;
        for (int r = 0; r < n; ++r) {
            for (int c = 0; c < n; ++c) {
                count += Math.min(max_row[r], max_col[c]) - grid[r][c];
            }
        }
        return count;
    }
}
