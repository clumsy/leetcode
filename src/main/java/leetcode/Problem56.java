package leetcode;

import java.util.*;

public class Problem56 {
    public static final class Alternative extends Problem56 {

        @Override
        public int[][] merge(int[][] intervals) {
            if (intervals == null || intervals.length == 0) {
                return intervals;
            }
            List<int[]> sorted = Arrays.asList(intervals);
            sorted.sort(Comparator.comparingInt(i -> i[0]));
            List<int[]> result = new ArrayList<>(sorted.size());
            for (int[] interval : sorted) {
                if (result.isEmpty()) {
                    result.add(interval);
                    continue;
                }
                int[] last = result.get(result.size() - 1);
                if (last[1] < interval[0]) {
                    result.add(interval);
                } else {
                    last[1] = Math.max(last[1], interval[1]);
                }
            }
            return result.toArray(new int[0][]);
        }
    }

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return intervals;
        }
        int length = intervals.length;
        int[] starts = new int[length];
        int[] ends = new int[length];
        for (int i = 0; i < length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        List<int[]> result = new ArrayList<>(length);
        for (int i = 0, j = 0; i < length; i++) {
            if (i == length - 1 || starts[i + 1] > ends[i]) {
                result.add(new int[] {starts[j], ends[i]});
                j = i + 1;
            }
        }
        return result.toArray(new int[0][]);
    }
}
