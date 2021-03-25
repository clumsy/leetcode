package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.N_BY_M) // N is amount, M is number of coins
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem518 {
    public int change(int amount, int[] coins) {
        if (coins.length == 0) {
            return amount == 0 ? 1 : 0;
        }
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[amount];
    }
}
