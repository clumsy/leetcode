package leetcode;

@BeatsPercent(50)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem837 {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k + maxPts) { // we always ends with n or less points
            return 1;
        }
        double[] dp = new double[n + 1];
        dp[0] = 1;
        double less_than_n = 0;
        double sliding_sum = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = sliding_sum/maxPts;
            if (i >= k) { // game ends, we only have states that ends with n or less points
                less_than_n += dp[i];
            } else {
                sliding_sum += dp[i];
            }
            if (i - maxPts >= 0) {
                sliding_sum -= dp[i - maxPts];
            }
        }
        return less_than_n;
    }
}
