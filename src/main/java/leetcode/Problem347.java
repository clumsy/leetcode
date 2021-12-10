package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BUCKET_SORT)
@BeatsPercent(99.38)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.compute(num, (__, v) -> v == null ? 1 : v + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1]; 
        count.forEach((num, n) -> {
            if (buckets[n] == null) {
                buckets[n] = new ArrayList<>();
            }
            buckets[n].add(num);
        });
        List<Integer> result = new ArrayList<>(k);
        for (int i = buckets.length - 1; k > 0 && i >= 0; --i) {
            if (buckets[i] != null) {
                result.addAll(buckets[i]);
                k -= buckets[i].size();
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
