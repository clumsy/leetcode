package leetcode;

@BeatsPercent(81.52)
@TimeComplexity(Complexity.QUADRATIC_N)
@SpaceComplexity(Complexity.QUADRATIC_N)
public class Problem403 {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        boolean[][] dp = new boolean[n][n + 1]; // can make a j-th unit jump from i-th stone
        dp[0][1] = true; // can make first jump of 1 unit to first stone
        for (int to = 1; to < n; to++) {
            for (int from = 0; from < to; from++) {
                int dist = stones[to] - stones[from];
                if (dist > n || !dp[from][dist]) { // cannot make a dist unit jump
                    continue;
                }
                if (to == n - 1) {
                    return true;
                }
                dp[to][dist] = true;
                if (dist > 1) {
                    dp[to][dist - 1] = true;
                }
                if (dist < n) {
                    dp[to][dist + 1] = true;
                }
            }
        }
        return false;
    }
}
