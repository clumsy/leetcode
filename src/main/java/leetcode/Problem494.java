package leetcode;

@BeatsPercent(61.53)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem494 {
    private static final int MAX = 2001; // [-1000;1000]

    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int[][] dp = new int[n][MAX];
        dp[0][+nums[0] + 1000]++;
        dp[0][-nums[0] + 1000]++;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < MAX; j++) {
                if (dp[i - 1][j] > 0) {
                    int plus_index = j + nums[i];
                    if (plus_index >= 0 && plus_index < MAX) {
                        dp[i][plus_index] += dp[i - 1][j];
                    }
                    int minus_index = j - nums[i];
                    if (minus_index >= 0 && minus_index < MAX) {
                        dp[i][minus_index] += dp[i - 1][j];
                    }
                }
            }
        }
        return dp[n - 1][target + 1000];
    }
}
