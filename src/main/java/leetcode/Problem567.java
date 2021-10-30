package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SLIDING_WINDOW)
@BeatsPercent(99.98)
@TimeComplexity(worst = Complexity.N_PLUS_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem567 {
    public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        int remains = 0;
        for (char c : s1.toCharArray()) {
            if (++count[c - 'a'] == 1) {
                remains++;
            }
        }
        char[] s = s2.toCharArray();
        for (int i = 0, j = 0, n = s.length; i < n; i++) {
            if (--count[s[i] - 'a'] == 0 && --remains == 0) {
                return true;
            }
            while (j <= i && count[s[i] - 'a'] < 0) {
                if (++count[s[j++] - 'a'] == 1) {
                    remains++;
                }
            }
        }
        return false;
    }
}
