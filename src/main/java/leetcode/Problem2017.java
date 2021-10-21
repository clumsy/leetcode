package leetcode;

@Difficulty(Level.MEDIUM)
@BeatsPercent(97.68)
@Algorithms(Algorithm.PREFIX_SUM)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem2017 {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long topSum = 0;
        for (int i = 0; i < n; i++) {
            topSum += grid[0][i];
        }

        long ans = Long.MAX_VALUE;
        long bottomSum = 0;
        for (int i = 0; i < n; i++) {
            topSum -= grid[0][i];
            // second robot can only pick either remaining top or bottom elements
            ans = Math.min(ans, Math.max(topSum, bottomSum));
            bottomSum += grid[1][i];
        }
        return ans;
    }
}
