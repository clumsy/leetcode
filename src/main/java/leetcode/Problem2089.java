package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.COUNTING_SORT)
@BeatsPercent(87.96)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        int smaller = 0;
        int equal = 0;
        for (int num : nums) {
            if (num == target) {
                ++equal;
            }
            if (num < target) {
                ++smaller;
            }
        }
        List<Integer> result = new ArrayList<>(equal);
        while (equal-- > 0) {
            result.add(smaller++);
        }
        return result;
    }
}
