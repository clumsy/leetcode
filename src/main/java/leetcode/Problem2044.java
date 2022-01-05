package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms({Algorithm.DYNAMIC_PROGRAMMING, Algorithm.KNAPSACK})
@BeatsPercent(16.94)
@TimeComplexity(worst = Complexity.N_BY_M) // where N is the max bitwise-OR, M is the nums length
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem2044 {
    public int countMaxOrSubsets(int[] nums) {
        int[] dp = new int[1 << 17]; // 1 << 17 is big enough for biggest mask we can have
        dp[0] = 1;
        int max = 0;
        for (int num : nums) {
            for (int i = max; i >= 0; --i) {
                dp[i | num] += dp[i];
            }
            max |= num;
        }
        return dp[max];
    }
}
