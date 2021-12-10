package leetcode;

import java.util.HashMap;
import java.util.Map;

@Difficulty(Level.MEDIUM)
@Algorithms({Algorithm.FREQUENCY_COUNT, Algorithm.PREFIX_SUM})
@BeatsPercent(99.55)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1); // one way to have an empty subarray
        int result = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num; // we know the current sum now
            result += count.getOrDefault(sum - k, 0); // check how many times we saw (sum - k)
            count.compute(sum, (__, v) -> v == null ? 1 : v + 1); // bump count for current sum
        }
        return result;
    }
}
