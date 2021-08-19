package leetcode;

@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(77.03)
@TimeComplexity(Complexity.N_SQRT_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
            }
        }
        return dp[n];
    }
}
