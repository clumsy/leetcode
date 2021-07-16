package leetcode;

import java.util.HashMap;
import java.util.Map;

@BeatsPercent(91.40)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1481 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        int[] count_of_counts = new int[10_001];
        counts.forEach((num, count) -> count_of_counts[count]++);
        int left = counts.size();
        for (int count = 1; count < count_of_counts.length; count++) {
            int nums = count_of_counts[count];
            if (k - nums*count <= 0) {
                return left - k/count;
            }
            k -= nums*count;
            left -= nums;
        }
        return left;
    }
}
