package leetcode;

@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(89.79)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.N_BY_M)
public class Problem72 {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n + 1][m + 1]; // edits to make first i letters of word1 be similar to j letters of word2
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i; // deleting i letters in word1
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j; // j inserts letters in word1
        }
        for (int j = 1; j <= m; j++) {
            for (int i = 1; i <= n; i++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // no new edits needed
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(
                        dp[i    ][j - 1],  // insert into word1
                        dp[i - 1][j - 1]), // replace in word1
                        dp[i - 1][j    ]); // delete from word1
                }
            }
        }
        return dp[n][m];
    }
}
