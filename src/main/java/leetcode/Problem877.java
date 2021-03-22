package leetcode;

public class Problem877 {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        return solve(piles, dp, 0, n - 1) > 0;
    }

    private int solve(int[] piles, int[][] dp, int left, int right) {
        int cached = dp[left][right];
        if (cached > 0) {
            return cached;
        }
        if (left == right) {
            int result = piles[left];
            dp[left][right] = result;
            return result;
        }
        int result = Math.max(
            piles[left]  - solve(piles, dp, left + 1, right),
            piles[right] - solve(piles, dp, left, right - 1));
        dp[left][right] = result;
        return result;
    }
}
