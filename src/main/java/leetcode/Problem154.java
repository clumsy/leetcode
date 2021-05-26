package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem154 {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo)/2;
            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else if (nums[lo] < nums[mid]) {
                return nums[lo];
            } else {
                hi--;
            }
        }
        return nums[lo];
    }
}
