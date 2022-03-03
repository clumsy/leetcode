package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BINARY_SEARCH)
@BeatsPercent(5.18)
@TimeComplexity(worst = Complexity.N_BY_M) // where N is the number of points, M is the number of queries 
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1828 {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = points.length;

        Integer[] by_x = new Integer[n];
        for (int i = 0; i < n; ++i) {
            by_x[i] = i;
        }
        Arrays.sort(by_x, Comparator.comparingInt(a -> points[a][0]));

        Integer[] by_y = new Integer[n];
        for (int i = 0; i < n; ++i) {
            by_y[i] = i;
        }
        Arrays.sort(by_y, Comparator.comparingInt(a -> points[a][1]));

        int m = queries.length;
        int[] result = new int[m];
        for (int j = 0; j < m; ++j) {
            int x0 = queries[j][0], y0 = queries[j][1], r = queries[j][2];
            Set<Integer> candidates = new HashSet<>();
            for (int i = lower_bound(n, k -> points[by_x[k]][0] < x0 - r), max = upper_bound(n, k -> points[by_x[k]][0] > x0 + r); i <= max; ++i) {
                candidates.add(by_x[i]);
            }
            for (int i = lower_bound(n, k -> points[by_y[k]][1] < y0 - r), max = upper_bound(n, k -> points[by_y[k]][1] > y0 + r); i <= max; ++i) {
                if (candidates.contains(by_y[i])) {
                    int x = points[by_y[i]][0] - x0;
                    int y = points[by_y[i]][1] - y0;
                    if (x*x + y*y <= r*r) {
                        ++result[j];
                    }
                }
            }
        }
        return result;
    }

    private int lower_bound(int n, Predicate<Integer> predicate) {
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo)/2;
            if (predicate.test(mid)) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    private int upper_bound(int n, Predicate<Integer> predicate) {
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = hi - (hi - lo)/2;
            if (predicate.test(mid)) {
                hi = mid - 1;
            } else {
                lo = mid;
            }
        }
        return lo;
    }
}
