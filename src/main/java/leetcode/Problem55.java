package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.WAVEFRONT_EXPANSION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem55 {
    public boolean canJump(int[] nums) {
        int max_jump = 0;
        for (int i = 0; i <= max_jump && i < nums.length; i++) {
            max_jump = Math.max(max_jump, i + nums[i]);
        }
        return max_jump >= nums.length - 1;
    }
}
