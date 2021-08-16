package leetcode;

@Algorithms(Algorithm.BINARY_SEARCH)
@BeatsPercent(100)
@TimeComplexity(average = Complexity.LOGARITHMIC_N, worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem81 {
    public boolean search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo)/2;
            if (target == nums[mid]) {
                return true;
            }
            if (nums[lo] < nums[mid]) { // left part is sorted
                if (target < nums[mid] && target >= nums[lo]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else if (nums[mid] < nums[lo]) { // right part is sorted
                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            } else { // no clue where it is, but it's not nums[lo], because nums[lo] == nums[mid]
                lo++;
            }
        }
        return nums[lo] == target;
    }
}
