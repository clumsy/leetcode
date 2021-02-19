package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Beats100Percent
public class Problem90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>((int) Math.pow(2, nums.length));
        List<Integer> current = new ArrayList<>(nums.length);
        collectSubsets(result, current, nums, 0);
        return result;
    }

    private void collectSubsets(List<List<Integer>> result, List<Integer> current, int[] nums, int offset) {
        result.add(new ArrayList<>(current));
        for (int i = offset; i < nums.length; i++) {
            if (i > offset && nums[i] == nums[i - 1]) {
                continue;
            }
            current.add(nums[i]);
            collectSubsets(result, current, nums, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
