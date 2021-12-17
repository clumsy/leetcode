package leetcode;

import java.util.Arrays;
import java.util.Comparator;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SORTING)
@BeatsPercent(45.93)
@TimeComplexity(worst = Complexity.LINEARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int max = 0;
        for (int i = 1; i < points.length; ++i) {
            max = Math.max(max, points[i][0] - points[i - 1][0]);
        }
        return max;
    }
}
