package leetcode;

import java.util.HashMap;
import java.util.Map;

@BeatsPercent(40.01)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem128 {
    public int longestConsecutive(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>(1001, 1);
        for (int n : nums) {
            if (!map.containsKey(n)) {
                int left = map.getOrDefault(n - 1, 0);
                int right = map.getOrDefault(n + 1, 0);

                // sum: length of the sequence n is in
                int sum = left + right + 1;
                map.put(n, sum);

                // keep track of the max length 
                answer = Math.max(answer, sum);

                // extend the length to the boundary(s) of the sequence  will do nothing if n has no neighbors
                map.put(n - left, sum);
                map.put(n + right, sum);
            }
        }
        return answer;
    }
}
