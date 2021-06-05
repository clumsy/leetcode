package leetcode;

import java.util.Arrays;

@BeatsPercent(16.43)
@TimeComplexity(Complexity.LINEARITHMIC_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1465 {
    private static final int MOD = (int) 1e9 + 7;

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int max_height = maxDiff(h, horizontalCuts);
        int max_width  = maxDiff(w, verticalCuts);
        return (int) ((long) max_height*max_width%MOD);
    }
    
    private static int maxDiff(int max, int[] cuts) {
        Arrays.sort(cuts);
        int max_diff = Math.max(cuts[0], max - cuts[cuts.length - 1]);
        for (int i = 0; i < cuts.length - 1; i++) {
            max_diff = Math.max(max_diff, cuts[i + 1] - cuts[i]);
        }
        return max_diff;
    }
}
