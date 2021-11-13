package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(99.40)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int count = 0;
        for (int s = 0, e = 0, product = 1; e < n; e++) {
            product *= nums[e];
            while (s <= e && product >= k) {
                product /= nums[s++];
            }
            count += e - s + 1;
        }
        return count;
    }
}
