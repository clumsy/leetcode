package leetcode;

import java.util.Arrays;

@Difficulty(Level.MEDIUM)
@BeatsPercent(91.87)
@Algorithms(Algorithm.QUICK_SELECT)
@TimeComplexity(average = Complexity.LINEAR_N, worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem973 {
    public int[][] kClosest(int[][] points, int k) {
        if (k >= points.length) {
            return points;
        }
        int lo = 0;
        int hi = points.length - 1;
        while (lo <= hi) {
            int pivot = partition(points, lo, hi);
            if (pivot == k) {
                break;
            }
            if (pivot > k) {
                hi = pivot - 1;
            } else {
                lo = pivot + 1;
            }
        }
        return Arrays.copyOfRange(points, 0, k);
    }

    private int partition(int[][] points, int lo, int hi) {
        int[] pivot = points[lo];
        while (lo < hi) {
            while (lo < hi && distance(points[hi]) - distance(pivot) >= 0) {
                hi--;
            }
            points[lo] = points[hi]; // points[hi] is closer to origin than pivot - move to pivot's original location
            while (lo < hi && distance(points[lo]) - distance(pivot) <= 0) {
                lo++;
            }
            points[hi] = points[lo]; // points[lo] is closer to origin than pivot - move to last position in the range
        }
        points[lo] = pivot; // pivot goes to the right spot
        return lo;
    }

    private static double distance(int[] point) {
        return Math.sqrt(point[0]*point[0] + point[1]*point[1]);
    }
}
