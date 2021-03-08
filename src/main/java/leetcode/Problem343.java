package leetcode;

@BeatsPercent(100)
public class Problem343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int max = 0;
            for (int j = 1, half = i/2; j <= half; j++) { // the other half is symmetrical
                int remainder = i - j;
                max = Math.max(max, Math.max(j*remainder, j*dp[remainder]));
            }
            dp[i] = max;
        }
        return dp[n];
    }
}
