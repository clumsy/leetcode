package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.WAVEFRONT_EXPANSION)
@BeatsPercent(99.51)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem45 {
    public int jump(int[] nums) {
        int jumps = 0;
        for (int i = 0, reach = 0, max_reach = 0, n = nums.length; reach < n && i < n; i++) {
            if (reach < i) {
                reach = max_reach;
                jumps++;
            }
            max_reach = Math.max(max_reach, i + nums[i]);
        }
        return jumps;
    }
}
