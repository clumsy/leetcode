package leetcode;

import java.util.Arrays;

@BeatsPercent(37.74)
@TimeComplexity(Complexity.LINEARITHMIC_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1029 {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
        int n = costs.length/2;
        int min = 0;
        for (int i = 0; i < costs.length; i++) {
            if (i >= n) {
                min += costs[i][1];
            } else {
                min += costs[i][0];
            }
        }
        return min;
    }
}
