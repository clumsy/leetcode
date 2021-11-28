package leetcode;

import java.util.Arrays;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(87.94)
@TimeComplexity(worst = Complexity.N_BY_M) // N - amount, M - number of coins
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        int none = amount + 1;
        Arrays.fill(dp, none);
        dp[0] = 0;
        for (int i = 1; i < none; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        return dp[amount] != none ? dp[amount] : -1;
    }
}
