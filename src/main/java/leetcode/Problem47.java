package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BACKTRACKING)
@BeatsPercent(99.45)
@TimeComplexity(worst = Complexity.FACTORIAL_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem47 {
    private static final int TAKEN = Integer.MIN_VALUE;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        return permuteUnique(new ArrayList<>(), new ArrayList<>(), nums, 0);
    }

    private List<List<Integer>> permuteUnique(List<List<Integer>> result, List<Integer> current, int[] nums, int count) {
        if (count == nums.length) {
            result.add(new ArrayList<>(current));
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == TAKEN || (i > 0 && nums[i] == nums[i - 1])) {
                continue;
            }
            int num = nums[i];
            nums[i] = TAKEN;
            current.add(num);
            permuteUnique(result, current, nums, count + 1);
            current.remove(current.size() - 1);
            nums[i] = num;
        }
        return result;
    }
}
