package leetcode;

import java.util.HashSet;
import java.util.Set;

@BeatsPercent(82.44)
@TimeComplexity(Complexity.CUBIC_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem963 {
    public double minAreaFreeRect(int[][] points) {
        int n = points.length;
        if (n < 4) {
            return 0;
        }
        Set<String> set = new HashSet<>(n, 1);
        for (int[] p : points) {
            set.add(p[0] + " " + p[1]);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int[] p1 = points[i];
            for (int j = i + 1; j < n; j++) { // not repeating same pair again
                int[] p2 = points[j];
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    int[] p3 = points[k];
                    if (perpendicular(p1, p2, p3)) {
                        int x = p2[0] + p3[0] - p1[0];
                        int y = p2[1] + p3[1] - p1[1];
                        if (set.contains(x + " " + y)) {
                            min = Math.min(min, area(p1, p2, p3));
                        }
                    }
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    private static int area(int[] p1, int[] p2, int[] p3) {
        return
            Math.abs(
                (p2[0] - p1[0])*(p3[1] - p2[1]) -
                (p3[0] - p2[0])*(p2[1] - p1[1]));
    }

    private boolean perpendicular(int[] p1, int[] p2, int[] p3) {
        // dot-product = 0 -> perpendicular
        return ((p2[0] - p1[0])*(p3[0] - p1[0]) + (p2[1] - p1[1])*(p3[1] - p1[1])) == 0;
    }
}
