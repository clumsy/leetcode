package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem695Test {
    private final Problem695 solution = new Problem695();

    @Test
    public void example1() {
        int[][] grid = new int[][] {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        assertThat(solution.maxAreaOfIsland(grid), is(6));
    }

    @Test
    public void example2() {
        int[][] grid = new int[][] {
            {0,0,0,0,0,0,0,0}
        };
        assertThat(solution.maxAreaOfIsland(grid), is(0));
    }

    @Test
    public void example3() {
        int[][] grid = new int[][] {
            {0,1},
            {1,1}
        };
        assertThat(solution.maxAreaOfIsland(grid), is(3));
    }
}
