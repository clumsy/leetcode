package leetcode;

import leetcode.Problem497.Solution;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem497Test {
    private final Problem497 solution = new Problem497();
    
    @Test
    public void example1() {
        int[][] rects = {
            {-2, -2, 1, 1},
            {2, 2, 4, 6}
        };
        Solution s = solution.new Solution(rects);
        int[] first = s.pick();
        assertThat(
            first[0] - rects[0][0] <= rects[0][2] - rects[0][0] ||
            first[0] - rects[1][0] <= rects[1][2] - rects[1][0],
            is(true));
        assertThat(
            first[1] - rects[0][1] <= rects[0][3] - rects[0][1] ||
            first[1] - rects[1][1] <= rects[1][3] - rects[1][1],
            is(true));
    }
}
