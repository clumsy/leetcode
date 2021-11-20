package leetcode;

@Difficulty(Level.MEDIUM)
@BeatsPercent(100)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem213 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        return
            Math.max(
                rob(nums, 1, n), // first house NOT robbed, can rob last
                nums[0] + rob(nums, 2, n - 1)); // first house robbed, can NOT rob last
    }

    public int rob(int[] nums, int lo, int hi) {
        int robbed_last = 0;
        int robbed_one_before_last = 0;
        for (int i = lo; i < hi; i++) {
            int tmp = robbed_last;
            robbed_last = Math.max(robbed_last, robbed_one_before_last + nums[i]);
            robbed_one_before_last = tmp;
        }
        return Math.max(robbed_last, robbed_one_before_last);
    }
}
