package leetcode;

@BeatsPercent(100)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
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
        int last_robbed = 0;
        int one_before_last_robbed = 0;
        for (int i = lo; i < hi; i++) {
            int tmp = last_robbed;
            last_robbed = Math.max(last_robbed, one_before_last_robbed + nums[i]);
            one_before_last_robbed = tmp;
        }
        return Math.max(last_robbed, one_before_last_robbed);
    }
}
