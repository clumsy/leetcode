package leetcode;

import java.util.Arrays;

@BeatsPercent(100)
@TimeComplexity(Complexity.QUADRATIC_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem1105 {
    public int minHeightShelves(int[][] books, int shelf_width) {
        int n = books.length;
        int[] dp = new int[n + 1]; // min height for i books
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // no books -> 0 height
        for (int i = 1; i <= n; i++) {
            int width = shelf_width;
            int height = 0;
            for (int j = i - 1; j >= 0 && width > 0; j--) {
                width -= books[j][0];
                height = Math.max(height, books[j][1]);
                if (width >= 0) {
                    dp[i] = Math.min(dp[i], dp[j] + height);
                }
            }
        }
        return dp[n];
    }
}
