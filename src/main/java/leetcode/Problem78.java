package leetcode;

import java.util.ArrayList;
import java.util.List;

@BeatsPercent(100)
public class Problem78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 1; i < Math.pow(2,nums.length); i++) {
            List<Integer> next = new ArrayList<>();
            int k = 0;
            int j = i;
            while (j > 0) {
                if (j % 2 == 1) {
                    next.add(nums[k]);
                }
                k++;
                j /= 2;
            }
            result.add(next);
        }
        return result;
    }
}
