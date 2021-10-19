package leetcode;

@Difficulty(Level.MEDIUM)
@BeatsPercent(95.95)
@Algorithms(Algorithm.MONOTONIC_STACK)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT) // we don't count space allocated for answer
public class Problem739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        int hottest = 0;
        for (int now = n - 1; now >= 0; now--) {
            hottest = Math.max(hottest, temperatures[now]);
            if (temperatures[now] >= hottest) {
                continue;
            }
            int days = 1;
            while (temperatures[now] >= temperatures[now + days]) {
                days += ans[now + days];
            }
            ans[now] = days;
        }
        return ans;
    }
}
