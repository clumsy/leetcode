package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.N_BY_M) // where N is text length and M is pattern length
@SpaceComplexity(Complexity.N_BY_M)
public class Problem10 {
    public boolean isMatch(String string, String pattern) {
        if (pattern == null || pattern.isEmpty()) {
            return string == null || string.isEmpty();
        }

        char[] s = string.toCharArray();
        char[] p = pattern.toCharArray();
        boolean[][] dp = new boolean[s.length + 1][p.length + 1];
        dp[0][0] = true; // empty string matches empty pattern
        for (int j = 2; j <= p.length; j++) {
            dp[0][j] = p[j - 1] == '*' && dp[0][j - 2]; // handling empty string matches by wildcard, e.g. a*b*c*
        }

        for (int j = 0; j < p.length; j++) {
            for (int i = 0; i < s.length; i++) {
                if (p[j] == s[i] || p[j] == '.') { // exact match
                    dp[i + 1][j + 1] = dp[i][j];
                } else if (p[j] == '*') { // wildcard match
                    dp[i + 1][j + 1] =
                        dp[i + 1][j - 1] || // empty match
                        ((p[j - 1] == s[i] || p[j - 1] == '.') && dp[i][j + 1]); // single match
                }
            }
        }
        return dp[s.length][p.length];
    }
}
