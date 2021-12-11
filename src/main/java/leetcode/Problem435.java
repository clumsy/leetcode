package leetcode;

import java.util.Arrays;
import java.util.Comparator;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.INTERVAL_SCHEDULING)
@BeatsPercent(94.87)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int remove = 0;
        for (int i = 1, end = intervals[0][1]; i < intervals.length; ++i) {
            if (intervals[i][0] < end) {
                remove++; // removing, until only 1 interval at end
            } else {
                end = intervals[i][1];
            }
        }
        return remove;
    }
}
