package leetcode;

import java.util.Arrays;
import java.util.Comparator;

@Difficulty(Level.MEDIUM)
@BeatsPercent(38.75)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@TimeComplexity(worst = Complexity.LINEARITHMIC_N) // where N is the number of rides
@SpaceComplexity(worst = Complexity.LINEAR_K) // where K is the number of points
public class Problem2008 {
    public long maxTaxiEarnings(int n, int[][] rides) {
        Arrays.sort(rides, Comparator.comparingInt(a -> a[0]));
        long[] dp = new long[n + 1]; // can earn at least as much as before
        int j = 0;
        for (int start = 1; start <= n; start++) {
            dp[start] = Math.max(dp[start - 1], dp[start]);
            // we are only interested in rides starting now, to maximize our profit
            while (j < rides.length && rides[j][0] == start) {
                int[] ride = rides[j];
                int end = ride[1];
                dp[end] = Math.max(dp[end], dp[start] + end - start + ride[2]);
                j++;
            }
        }
        return dp[n];
    }
}
