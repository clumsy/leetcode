package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem304Test {
    private final Problem304 solution = new Problem304();

    @Test
    public void example1() {
        Problem304.NumMatrix numMatrix = solution.new NumMatrix(new int[][]{
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
        });
        assertThat(numMatrix.sumRegion(2,1,4,3), is(8));
        assertThat(numMatrix.sumRegion(1, 1, 2, 2), is(11));
        assertThat(numMatrix.sumRegion(1, 2, 2, 4), is(12));
    }
}
