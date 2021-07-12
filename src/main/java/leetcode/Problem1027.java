package leetcode;

import java.util.HashMap;

@BeatsPercent(52.58)
@TimeComplexity(worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.QUADRATIC_N)
public class Problem1027 {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return n;
        }
        int max = 2;
        HashMap<Integer, Integer>[] map = new HashMap[n];
        for (int i = n - 1; i >= 0; i--) {
            int num = nums[i];
            map[i] = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                int diff = nums[j] - num;
                int current_length = map[j].getOrDefault(diff, 1) + 1;
                map[i].put(diff, Math.max(map[i].getOrDefault(diff, 1), current_length));
                max = Math.max(max, current_length);
            }
        }
        return max;
    }
}
