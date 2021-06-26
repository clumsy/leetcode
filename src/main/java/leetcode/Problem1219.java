package leetcode;

@BeatsPercent(94.73)
@TimeComplexity(worst = Complexity.EXPONENTIAL_3K) // where k is the number of cells with gold, k*4*3^(k-1) = 3^k
@SpaceComplexity(worst = Complexity.LINEAR_K) // max depth of the call stack
public class Problem1219 {
    public int getMaximumGold(int[][] grid) {
        int answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    answer = Math.max(answer, dfs(grid, i, j));
                }
            }
        }
        return answer;
    }

    private static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length) {
            return 0;
        }
        if (j < 0 || j >= grid[0].length) {
            return 0;
        }
        if (grid[i][j] == 0) {
            return 0;
        }
        int gold = grid[i][j];
        grid[i][j] = 0;
        int max = 0;
        max = Math.max(max, gold + dfs(grid, i + 1, j));
        max = Math.max(max, gold + dfs(grid, i - 1, j));
        max = Math.max(max, gold + dfs(grid, i, j + 1));
        max = Math.max(max, gold + dfs(grid, i, j - 1));
        grid[i][j] = gold;
        return max;
    }
}
