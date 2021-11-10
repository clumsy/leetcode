package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BINARY_SEARCH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LOGARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem162 {
    public int findPeakElement(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (hi - lo > 1) {
            int mid = lo + (hi - lo)/2;
            if (nums[mid] < nums[mid + 1]) { // increases - there should be a peak on the right
                lo = mid + 1;
            } else { // decreases - there should be a peak on the left
                hi = mid;
            }
        }
        return nums[lo] < nums[hi] ? hi : lo;
    }
}
