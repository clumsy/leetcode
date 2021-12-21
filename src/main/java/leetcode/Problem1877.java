package leetcode;

import java.util.Arrays;

@Difficulty(Level.MEDIUM)
@Algorithms({Algorithm.TWO_POINTERS, Algorithm.SORTING})
@BeatsPercent(93.45)
@TimeComplexity(worst = Complexity.LINEARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int lo = 0, hi = nums.length - 1; lo < hi; ) {
            max = Math.max(max, nums[lo++] + nums[hi--]);
        }
        return max;
    }
}
