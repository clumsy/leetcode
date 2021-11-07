package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.KADANE)
@BeatsPercent(91.69)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int num : nums) {
            current = Math.max(num, current + num);
            max = Math.max(max, current);
        }
        return max;
    }
}
