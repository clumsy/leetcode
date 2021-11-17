package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BACKTRACKING)
@BeatsPercent(99.72)
@TimeComplexity(worst = Complexity.EXPONENTIAL_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>(1 << nums.length);
        result.add(new ArrayList<>(nums.length));
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i > 0 && nums[i] == nums[i - 1] ? /* previous */ size : 0;
            size = result.size();
            for (int j = start; j < size; j++) {
                result.add(new ArrayList<>(result.get(j)));
                result.get(result.size() - 1).add(nums[i]);
            }
        }
        return result;
    }
}
