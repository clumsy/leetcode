package leetcode;

@BeatsPercent(89.91)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem188 {
    public int maxProfit(int k, int[] prices) {
        k *= 2; // 1 for a buy + 1 for a sell
        int n = prices.length;
        int[][] dp = new int[n + 1][k + 1]; // day, operations made (buys + sells)
        int no_value = Integer.MIN_VALUE/2;
        for (int j = 0; j <= k; j++) {
            dp[0][j] = no_value;
        }
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = Math.max(
                    dp[i - 1][j], // don't do anything
                    j == 0 ? no_value : dp[i - 1][j - 1] + ((j & 1) == 1 ? -1 : 1)*prices[i - 1]); // buy/sell
            }
        }
        int max = 0;
        for (int j = 0; j <= k; j++) {
            max = Math.max(max, dp[n][j]);
        }
        return max;
    }
}
