package leetcode;

@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1093 {
    public double[] sampleStats(int[] count) {
        double min = 256;
        double max = -1;
        int mode = 0;
        int count_lo = 0;
        int count_hi = 0;
        double sum = 0;
        int lo = 0;
        int hi = count.length - 1;
        int mid_lo = 0;
        int mid_hi = 0;
        while (lo <= hi) {
            while (count[lo] == 0) {
                lo++;
            }
            while (count[hi] == 0) {
                hi--;
            }
            if (count_lo < count_hi) {
                min = Math.min(min, lo);
                max = Math.max(max, lo);
                count_lo += count[lo];
                sum += (double) count[lo]*lo;
                if (count[lo] > count[mode]) {
                    mode = lo;
                }
                mid_lo = lo;
                lo++;
            } else {
                min = Math.min(min, hi);
                max = Math.max(max, hi);
                count_hi += count[hi];
                sum += (double) count[hi]*hi;
                if (count[hi] > count[mode]) {
                    mode = hi;
                }
                mid_hi = hi;
                hi--;
            }
        }
        double mean = sum/(count_lo + count_hi);
        double median;
        if (count_lo < count_hi) {
            median = mid_hi;
        } else if (count_lo > count_hi) {
            median = mid_lo;
        } else {
            median = (mid_lo + mid_hi)/2.;
        }
        return new double[] {min, max, mean, median, mode};
    }
}
