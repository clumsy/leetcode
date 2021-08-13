package leetcode;

import java.util.Arrays;

@BeatsPercent(46.35)
@TimeComplexity(worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.QUADRATIC_N)
public class Problem1508 {
    private static final int MOD = 1_000_000_007;

    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] sums = new int[n*(n + 1)/2];
        int size = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                sums[size++] = sum;
            }

        }
        Arrays.sort(sums, 0, size);
        int sum = 0;
        for (int i = left - 1; i < right; i++) {
            sum += sums[i];
            sum %= MOD;
        }
        return sum;
    }
}
