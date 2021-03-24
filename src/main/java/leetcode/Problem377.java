package leetcode;

@BeatsPercent(85.55)
@TimeComplexity(Complexity.N_BY_M) // N - target, N - length of nums
@SpaceComplexity(Complexity.N_BY_M)
public class Problem377 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            if (dp[i] > 0) {
                for (int num : nums) {
                    if (i + num <= target) {
                        dp[i + num] += dp[i];
                    }
                }
            }
        }
        return dp[target];
    }
}
