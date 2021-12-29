package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.MATH)
@BeatsPercent(95.76)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1630 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m = l.length;
        List<Boolean> answer = new ArrayList<>(m);
        for (int i = 0; i < m; ++i) {
            int len = r[i] - l[i];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = l[i]; j <= r[i]; ++j) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
            }
            if (min == max) { // all same number
                answer.add(true);
            } else if ((max - min) % len != 0) { // a[i] - a[0] = a[0] + i*k - a[0] = i*k => len | max - min
                answer.add(false);
            } else {
                boolean[] a = new boolean[len + 1];
                boolean result = true;
                int k = (max - min) / len;
                for (int j = l[i]; j <= r[i]; ++j) {
                    if ((nums[j] - min) % k != 0 || a[(nums[j] - min) / k]) {
                        result = false;
                        break;
                    }
                    a[(nums[j] - min) / k] = true;
                }
                answer.add(result);
            }
        }
        return answer;
    }
}
