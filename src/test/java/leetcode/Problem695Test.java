package leetcode;

import org.junit.Test;

public class Problem695Test {
    private final Problem695 solution = new Problem695();

    @Test
    public void example1() {
        int[][] grid = {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        assert solution.maxAreaOfIsland(grid) == 6;
    }

    @Test
    public void example2() {
        int[][] grid = {
            {0,0,0,0,0,0,0,0}
        };
        assert solution.maxAreaOfIsland(grid) == 0;
    }

    @Test
    public void example3() {
        int[][] grid = {
            {0,1},
            {1,1}
        };
        assert solution.maxAreaOfIsland(grid) == 3;
    }
}
