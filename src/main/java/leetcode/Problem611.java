package leetcode;

import java.util.Arrays;

@BeatsPercent(81.38)
@TimeComplexity(Complexity.QUADRATIC_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem611 {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0, n = nums.length;
        for (int i = n - 1; i >= 2; i--) {
            int lo = 0;
            int hi = i - 1;
            while (lo < hi) {
                if (nums[lo] + nums[hi] > nums[i]) {
                    count += hi - lo;
                    hi--;
                } else {
                    lo++;
                }
            }
        }
        return count;
    }
}
