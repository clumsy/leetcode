package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LOGARITHMIC_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem153 {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo)/2;
            if (nums[mid] < nums[hi]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return nums[lo];
    }
}
