package leetcode;

import java.util.Arrays;

@Algorithms(Algorithm.SLIDING_WINDOW)
@BeatsPercent(88.51)
@TimeComplexity(worst = Complexity.LINEARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1838 {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        Arrays.sort(nums);
        int max = 0;
        long sum = 0;
        for (int i = 0, j = 0; j < n; j++) {
            long num = nums[j];
            sum += num;
            while (k + sum < (j - i + 1)*num) {
                sum -= nums[i++];
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}