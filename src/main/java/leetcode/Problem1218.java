package leetcode;

@BeatsPercent(98.95)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1218 {
    public int longestSubsequence(int[] arr, int difference) {
        int max = 2*10_000;
        int[] dp = new int[max + 1];
        int answer = Integer.MIN_VALUE;
        for (int a : arr) {
            int i = a + 10_000;
            int prev = i - difference;
            dp[i] = Math.max(dp[i], (prev > max || prev < 0 ? 0 : dp[i - difference]) + 1);
            answer = Math.max(answer, dp[i]);
        }
        return answer;
    }
}
