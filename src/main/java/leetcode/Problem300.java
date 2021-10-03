package leetcode;

@BeatsPercent(99.45)
@Algorithms(Algorithm.PATIENCE_SORTING)
@TimeComplexity(worst = Complexity.LINEARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem300 {
    public int lengthOfLIS(int[] nums) {
        int piles = 0;
        for (int i = 0; i < nums.length; i++) {
            int lo = 0;
            int hi = piles;
            while (lo < hi) {
                int mid = lo + (hi - lo)/2;
                if (nums[mid] < nums[i]) {
                    lo = mid + 1; // finding lower-bound
                } else {
                    hi = mid;
                }
            }
            nums[hi] = nums[i];
            if (hi == piles) { // new pile
                ++piles;
            }
        }
        return piles;
    }
}
