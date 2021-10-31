package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(48.05)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }

    private int dfs(int[][] a, int r, int c) {
        if (r < 0 || r >= a.length || c < 0 || c >= a[0].length || a[r][c] == 0) {
            return 0;
        }
        a[r][c] = 0;
        return 1 + dfs(a, r - 1, c) + dfs(a, r + 1, c) + dfs(a, r, c - 1) + dfs(a, r, c + 1);
    }
}
