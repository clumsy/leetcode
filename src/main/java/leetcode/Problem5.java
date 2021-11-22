package leetcode;

import java.util.Arrays;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.CONSTRUCT_AROUND_THE_MIDDLE)
@BeatsPercent(98.08)
@TimeComplexity(worst = Complexity.QUADRATIC_N) // Can have O(N) with Manacher algorithm
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem5 {
    public String longestPalindrome(String s) {
        char[] ss = s.toCharArray();
        int m = 0, max_length = 0;
        for (int i = 0; i < ss.length; i++) {
            int length = Math.max(largestPalindrome(ss, i, i), largestPalindrome(ss, i, i + 1));
            if (max_length < length) {
                max_length = length;
                m = i;
            }
        }
        return new String(Arrays.copyOfRange(ss, m - (max_length - 1)/2, m - (max_length - 1)/2 + max_length));
    }

    private int largestPalindrome(char[] s, int l, int r) {
        while (l >= 0 && r < s.length && s[l] == s[r]) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}
