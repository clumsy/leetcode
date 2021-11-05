package leetcode;

@Difficulty(Level.MEDIUM)
@BeatsPercent(100)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem198 {
    public int rob(int[] nums) {
        int max_last = 0;
        int max_one_before_last = 0;
        for (int num : nums) {
            int tmp = max_last;
            max_last = Math.max(max_one_before_last + num, max_last);
            max_one_before_last = tmp;
        }
        return max_last;
    }
}
