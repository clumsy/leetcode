package leetcode;

@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(78.62)
@TimeComplexity(worst = Complexity.N_BY_M) // where N is the length of the string, M is the length of the pattern
@SpaceComplexity(worst = Complexity.N_BY_M) // where N is the length of the string, M is the length of the pattern
public class Problem44 {
    public boolean isMatch(String ss, String pp) {
        char[] s = ss.toCharArray();
        char[] p = pp.toCharArray();
        int n = s.length;
        int m = p.length;
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for (int j = 1; j <= m; j++) {
            if (p[j - 1] != '*') {
                break;
            }
            dp[0][j] = true; // empty string matches
        }
        for (int j = 1; j <= m; j++) {
            for (int i = 1; i <= n; i++) {
                if (s[i - 1] == p[j - 1] || p[j - 1] == '?') {
                    dp[i][j] = dp[i - 1][j - 1]; // exact match
                    continue;
                }
                if (p[j - 1] == '*') {
                    dp[i][j] =
                            dp[i][j - 1] || // occurred previously
                                    dp[i - 1][j];   // zero occurrences
                }
            }
        }
        return dp[n][m];
    }
}
