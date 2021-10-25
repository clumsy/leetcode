package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.BINARY_SEARCH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LOGARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem35 {
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }
}
