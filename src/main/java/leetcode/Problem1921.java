package leetcode;

import java.util.Arrays;

@Algorithms(Algorithm.SORTING)
@BeatsPercent(97.56)
@TimeComplexity(worst = Complexity.LINEARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1921 {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        for (int i = 0; i < n; i++) {
            dist[i] = (dist[i] - 1)/speed[i]; // subtracting 1 because we need to kill it before arrival
        }
        Arrays.sort(dist);
        for (int i = 0; i < n; i++) {
            if (i > dist[i]) {
                return i;
            }
        }
        return n;
    }
}
