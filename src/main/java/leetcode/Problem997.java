package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.FREQUENCY_COUNT)
@BeatsPercent(83.07)
@TimeComplexity(worst = Complexity.LINEAR_K) // where K is the maximum of N and length of trusts array
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem997 {
    public int findJudge(int n, int[][] trust) {
        int[] trust_balance = new int[n + 1];
        for (int[] pair : trust) {
            ++trust_balance[pair[1]];
            --trust_balance[pair[0]];
        }
        for (int i = 1; i <= n; i++) {
            if (trust_balance[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
