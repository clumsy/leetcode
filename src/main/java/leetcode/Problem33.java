package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BINARY_SEARCH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LOGARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem33 {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi)/2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[lo] <= nums[mid]) { // left is sorted
                if (target < nums[mid] && target >= nums[lo]) { // target can only be on the left
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else { // right is sorted
                if (target > nums[mid] && target <= nums[hi]) { // target can only be on the right
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}
