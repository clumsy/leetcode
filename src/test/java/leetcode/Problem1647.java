package leetcode;

import java.util.Arrays;

@BeatsPercent(63.42)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1647 {
    public int minDeletions(String s) {
        int[] freqs = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            freqs[s.charAt(i) - 'a']++;
        }
        Arrays.sort(freqs);
        int deletes = 0;
        int expected = freqs[25];
        for (int i = 25; i >= 0 && freqs[i] > 0; i--) {
            int diff = freqs[i] - expected;
            if (diff > 0) {
                deletes += diff;
            } else {
                expected = freqs[i];
            }
            expected = Math.max(0, expected - 1);
        }
        return deletes;
    }
}
