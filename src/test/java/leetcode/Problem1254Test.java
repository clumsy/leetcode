package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1254Test {
    private final Problem1254 solution = new Problem1254();

    @Test
    public void example1() {
        int[][] grid = new int[][] {
            {1,1,1,1,1,1,1,0},
            {1,0,0,0,0,1,1,0},
            {1,0,1,0,1,1,1,0},
            {1,0,0,0,0,1,0,1},
            {1,1,1,1,1,1,1,0},
        };
        assertThat(solution.closedIsland(grid), is(2));
    }

    @Test
    public void example4() {
        int[][] grid = new int[][] {
            {0,0,1,1,0,1,0,0,1,0},
            {1,1,0,1,1,0,1,1,1,0},
            {1,0,1,1,1,0,0,1,1,0},
            {0,1,1,0,0,0,0,1,0,1},
            {0,0,0,0,0,0,1,1,1,0},
            {0,1,0,1,0,1,0,1,1,1},
            {1,0,1,0,1,1,0,0,0,1},
            {1,1,1,1,1,1,0,0,0,0},
            {1,1,1,0,0,1,0,1,0,1},
            {1,1,1,0,1,1,0,1,1,0},
        };
        assertThat(solution.closedIsland(grid), is(5));
    }
}
