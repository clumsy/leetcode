package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1020Test {
    private final Problem1020 solution = new Problem1020();

    @Test
    public void example1() {
        int[][] grid = new int[][] {
            {0,0,0,0},
            {1,0,1,0},
            {0,1,1,0},
            {0,0,0,0}
        };
        assertThat(solution.numEnclaves(grid), is(3));
    }

    @Test
    public void example2() {
        int[][] grid = new int[][] {
            {0,1,1,0},
            {0,0,1,0},
            {0,0,1,0},
            {0,0,0,0}
        };
        assertThat(solution.numEnclaves(grid), is(0));
    }

    @Test
    public void example3() {
        int[][] grid = new int[][] {
            {0,0,0,1,1,1,0,1,0,0},
            {1,1,0,0,0,1,0,1,1,1},
            {0,0,0,1,1,1,0,1,0,0},
            {0,1,1,0,0,0,1,0,1,0},
            {0,1,1,1,1,1,0,0,1,0},
            {0,0,1,0,1,1,1,1,0,1},
            {0,1,1,0,0,0,1,1,1,1},
            {0,0,1,0,0,1,0,1,0,1},
            {1,0,1,0,1,1,0,0,0,0},
            {0,0,0,0,1,1,0,0,0,1},
        };
        assertThat(solution.numEnclaves(grid), is(3));
    }
}
