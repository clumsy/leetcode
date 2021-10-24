package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(42.04)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.QUADRATIC_N)
public class Problem1140 {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n + 1][n + 1]; // How much I can get from i-th position for a given M?
        int total = 0;
        for (int i = n - 1; i >= 0; i--) {
            total += piles[i];
            for (int m = 1; m <= n; m++) {
                if (m + i > n) {
                    dp[i][m] = dp[i][m - 1]; // Cannot get more with bigger M
                    continue;
                }
                int min = Integer.MAX_VALUE;
                for (int x = 1; i + x <= n && x <= Math.min(2*m, n); x++) {
                    min = Math.min(min, dp[i + x][Math.max(m, x)]);
                }
                dp[i][m] = total - min;
            }
        }
        return dp[0][1];
    }
}
