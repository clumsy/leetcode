package leetcode;

import java.util.Arrays;

@BeatsPercent(75.67)
@TimeComplexity(Complexity.LINEARITHMIC_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem1051 {
    public int heightChecker(int[] heights) {
        int length = heights.length;
        int[] sorted = new int[length];
        System.arraycopy(heights, 0, sorted, 0, length);
        Arrays.sort(sorted);
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (sorted[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
