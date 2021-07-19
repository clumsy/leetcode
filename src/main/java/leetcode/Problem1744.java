package leetcode;

@BeatsPercent(55.88)
@TimeComplexity(Complexity.N_PLUS_K)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem1744 {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = candiesCount.length;
        long[] prefix_sum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + candiesCount[i - 1];
        }
        int k = queries.length;
        boolean[] answer = new boolean[k];
        for (int i = 0; i < k; i++) {
            int type = queries[i][0];
            int day  = queries[i][1];
            int cap  = queries[i][2];
            long minDay = prefix_sum[type]/cap;
            long maxDay = prefix_sum[type + 1] - 1; // need to have 1 candy left
            answer[i] = day <= maxDay && day >= minDay;
        }
        return answer;
    }
}
