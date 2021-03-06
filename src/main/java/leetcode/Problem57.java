package leetcode;

import java.util.ArrayList;
import java.util.List;

@BeatsPercent(98.83)
public class Problem57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int N = intervals.length;
        if (N == 0) {
            return new int[][] {newInterval};
        }
        List<int[]> result = new ArrayList<>(N);
        int i = 0;
        int intervalStart = newInterval[0];
        while (i < N && intervals[i][1] < intervalStart) {
            result.add(intervals[i]);
            i++;
        }
        int start = intervalStart;
        if (i < N) {
            start = Math.min(intervals[i][0], start);
        }
        int intervalEnd = newInterval[1];
        int end = intervalEnd;
        while (i < N && intervals[i][0] <= intervalEnd) {
            end = Math.max(intervals[i++][1], end);
        }
        result.add(new int[] {start, end});
        while (i < N) {
            result.add(intervals[i++]);
        }
        return result.toArray(new int[0][0]);
    }

    // Ugly but best case O(log(N))
//    public int[][] insert(int[][] intervals, int[] newInterval) {
//        int N = intervals.length;
//        int left = 0;
//        int right = N - 1;
//        int newIntervalStart = newInterval[0];
//        while (left < right) {
//            int mid = left + (right - left)/2;
//            int intervalEnd = intervals[mid][1];
//            if (intervalEnd < newIntervalStart) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        int first = left;
//
//        left = 0;
//        right = N - 1;
//        int newIntervalEnd = newInterval[1];
//        while (left < right) {
//            int mid = left + (right - left)/2;
//            int intervalEnd = intervals[mid][1];
//            if (intervalEnd < newIntervalEnd) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        int last = left;
//
//        List<int[]> result = new ArrayList<>(N);
//        int i = 0;
//        while (i < N && intervals[i][1] < newIntervalStart) {
//            result.add(intervals[i++]);
//        }
//
//        int start = newIntervalStart;
//        if (first < N && intervals[first][1] >= start) {
//            start = Math.min(start, intervals[first][0]); // Simplify?
//        }
//        i = last;
//        int end = newIntervalEnd;
//        if (last < N && intervals[last][0] <= end) {
//            end = Math.max(end, intervals[last][1]); // Simplify?
//            i++;
//        }
//        result.add(new int[] {start, end});
//
//        while (i < N) {
//            result.add(intervals[i++]);
//        }
//        return result.toArray(new int[0][0]);
//    }
}
