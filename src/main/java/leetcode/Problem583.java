package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(28.12)
@TimeComplexity(worst = Complexity.N_BY_M)
@SpaceComplexity(worst = Complexity.LINEAR_N) // where N is shortest of two strings
public class Problem583 {
    
    // alternatively we can find the length of common subsequence Z, then answer = word1.length() + word2.length() - 2*Z
    public int minDistance(String word1, String word2) {
        if (word1.length() < word2.length()) {
            return minDistance(word2, word1);
        }
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int[][] dp = new int[2][w2.length + 1];
        for (int i = 0; i <= w1.length; i++) {
            for (int j = 0; j <= w2.length; j++) {
                if (j == 0) {
                    dp[i % 2][0] = i;
                    continue;
                }
                if (i == 0) {
                    dp[0][j] = j;
                    continue;
                }
                if (w1[i - 1] == w2[j - 1]) {
                    dp[i % 2][j] = dp[(i - 1) % 2][j - 1];
                } else {
                    dp[i % 2][j] = Math.min(dp[(i - 1) % 2][j], dp[i % 2][j - 1]) + 1;
                }
            }
        }
        return dp[w1.length % 2][w2.length];
    }
}
