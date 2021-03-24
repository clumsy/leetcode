package leetcode;

@BeatsPercent(87.94)
@TimeComplexity(Complexity.N_BY_M) // N - amount, K - number of coins
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        int token = amount + 1;
        for (int i = 1; i < token; i++) {
            dp[i] = token;
        }
        for (int i = 1; i < token; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        return dp[amount] != token ? dp[amount] : -1;
    }
}
