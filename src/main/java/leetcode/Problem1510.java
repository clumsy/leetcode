package leetcode;

@Difficulty(Level.HARD)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(59.51)
@TimeComplexity(worst = Complexity.N_SQRT_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1510 {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j*j <= n - i; j++) {
                if (!dp[i + j*j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
    }
}
