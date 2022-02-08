package leetcode;

import java.util.Arrays;
import java.util.Comparator;

@Difficulty(Level.MEDIUM)
@Algorithms({Algorithm.SORTING, Algorithm.BINARY_SEARCH})
@BeatsPercent(81.71)
@TimeComplexity(worst = Complexity.LINEARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem436 {
    public int[] findRightInterval(int[][] intervals) {
        int[] result = new int[intervals.length];
        for (int i = 0; i < intervals.length; ++i) {
            result[i] = intervals[i][1];
            intervals[i][1] = i;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < intervals.length; ++i) {
            result[i] = find(intervals, result[i]);
        }
        return result;
    }

    private int find(int[][] intervals, int end) {
        int lo = 0;
        int hi = intervals.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo)/2;
            if (intervals[mid][0] >= end) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return intervals[lo][0] >= end ? intervals[lo][1] : -1;
    }
}
