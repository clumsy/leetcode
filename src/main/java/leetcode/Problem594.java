package leetcode;

import java.util.HashMap;
import java.util.Map;

@BeatsPercent(46.64)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem594 {
    public int findLHS(int[] nums) {
        int n = nums.length;
        int max = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            int num = nums[i];
            int current_count = counts.compute(num, (k, v) -> v == null ? 1 : v + 1);
            int length =
                Math.max(
                    counts.getOrDefault(num - 1, 0) + current_count,
                    counts.getOrDefault(num + 1, 0) + current_count);
            if (length != current_count) {
                max = Math.max(max, length);
            }
        }
        return max;
    }
}
