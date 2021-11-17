package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BIT_MANIPULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.EXPONENTIAL_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem78 {
    public List<List<Integer>> subsets(int[] nums) {
        int count = 1 << nums.length;
        List<List<Integer>> result = new ArrayList<>(count);
        for (int mask = 0; mask < count; mask++) {
            List<Integer> current = new ArrayList<>(nums.length);
            for (int bit = 0; (1 << bit) <= mask; bit++) {
                if ((mask & (1 << bit)) > 0) {
                    current.add(nums[bit]);
                }
            }
            result.add(current);
        }
        return result;
    }
}
