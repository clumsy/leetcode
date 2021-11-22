package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SORTING)
@BeatsPercent(29.44)
@TimeComplexity(worst = Complexity.LINEARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem56 {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n < 2) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>(n);
        int[] last = intervals[0];
        result.add(last);
        for (int[] interval : intervals) {
            if (last[1] >= interval[0]) {
                last[1] = Math.max(last[1], interval[1]);
            } else {
                last = interval;
                result.add(last);
            }
        }
        return result.toArray(new int[0][]);
    }
}
