package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(93.34)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem91 {
    public int numDecodings(String s) {
        char[] ss = s.toCharArray();
        int[] dp = new int[ss.length];
        dp[0] = ss[0] == '0' ? 0 : 1;
        for (int i = 1; i < ss.length; i++) {
            int first = ss[i] - '0';
            if (1 <= first && first <= 9) {
                dp[i] += dp[i - 1];
            }
            int second = (ss[i - 1] - '0') * 10 + first;
            if (10 <= second && second <= 26) {
                dp[i] += i > 1 ? dp[i - 2] : 1;
            }
        }
        return dp[ss.length - 1];
    }
}
