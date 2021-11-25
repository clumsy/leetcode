package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(99.74)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.LINEAR_N) // where N is the length of the smallest string
public class Problem1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() < text2.length()) {
            return longestCommonSubsequence(text2, text1);
        }
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int[][] dp = new int[2][t2.length + 1];
        for (int i = 1; i <= t1.length; i++) {
            for (int j = 1; j <= t2.length; j++) {
                if (t1[i - 1] == t2[j - 1]) {
                    dp[i % 2][j] = dp[(i - 1) % 2][j - 1] + 1;
                } else {
                    dp[i % 2][j] = Math.max(dp[(i - 1) % 2][j], dp[i % 2][j - 1]);
                }
            }
        }
        return dp[t1.length % 2][t2.length];
    }
}
