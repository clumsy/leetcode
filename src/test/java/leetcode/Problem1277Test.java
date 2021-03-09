package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1277Test {
    private final Problem1277 solution = new Problem1277();

    @Test
    public void example1() {
        int[][] matrix = new int[][]{
            {0, 1, 1, 1},
            {1, 1, 1, 1},
            {0, 1, 1, 1}
        };
        assertThat(solution.countSquares(matrix), is(15));
    }

    @Test
    public void example2() {
        int[][] matrix = new int[][]{
            {1,0,1},
            {1,1,0},
            {1,1,0}
        };
        assertThat(solution.countSquares(matrix), is(7));
    }
}
