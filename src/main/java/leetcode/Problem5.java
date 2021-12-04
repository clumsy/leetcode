package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.CONSTRUCT_AROUND_THE_MIDDLE)
@BeatsPercent(98.08)
@TimeComplexity(worst = Complexity.QUADRATIC_N) // Can have O(N) with Manacher algorithm
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem5 {
    public String longestPalindrome(String s) {
        char[] ss = s.toCharArray();
        int max_length = 1;
        int middle = 0;
        for (int i = 0; i < ss.length; i++) {
            int length = Math.max(largestPalindrome(ss, i, i), largestPalindrome(ss, i, i + 1));
            if (max_length < length) {
                max_length = length;
                middle = i;
            }
        }
        int start = middle - (max_length - 1) / 2;
        return s.substring(start, start + max_length);
    }

    private int largestPalindrome(char[] s, int left, int right) {
        while (left >= 0 && right < s.length && s[left] == s[right]) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
