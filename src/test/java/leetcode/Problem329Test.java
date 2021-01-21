package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem329Test {
    private final Problem329 solution = new Problem329();

    @Test
    public void example1() {
        int[][] matrix = new int[][] {
            {9, 9, 4},
            {6, 6, 8},
            {2, 1, 1}
        };
        assertThat(solution.longestIncreasingPath(matrix), is(4));
    }

    @Test
    public void example2() {
        int[][] matrix = new int[][] {
            {3, 4, 5},
            {3, 2, 6},
            {2, 2, 1}
        };
        assertThat(solution.longestIncreasingPath(matrix), is(4));
    }

    @Test
    public void example3() {
        int[][] matrix = new int[][] {
            {1}
        };
        assertThat(solution.longestIncreasingPath(matrix), is(1));
    }

    @Test
    public void example4() {
        int[][] matrix = new int[][] {
            {17, 4, 6, 11, 4, 0, 17, 12, 19, 12, 12, 0},
            {0,  6, 4,  4, 5, 9, 15, 1,  11, 13, 18, 0},
            {4,  2, 13, 1, 2, 7, 15, 5,  14, 6,  8,  6}
        };
        assertThat(solution.longestIncreasingPath(matrix), is(6));
    }
}
