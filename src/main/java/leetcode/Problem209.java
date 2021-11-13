package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(99)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem209 {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        for (int s = 0, e = 0, sum = 0; e < nums.length; e++) {
            sum += nums[e];
            while (sum - nums[s] >= target) {
                sum -= nums[s++];
            }
            if (sum >= target) {
                result = Math.min(result, e - s + 1);
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
