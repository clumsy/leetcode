package leetcode;

import org.junit.Test;

public class Problem807Test {
    private final Problem807 solution = new Problem807();
    
    @Test
    public void example1() {
        int[][] grid = {
            {3,0,8,4},
            {2,4,5,7},
            {9,2,6,3},
            {0,3,1,0},
        };
        assert solution.maxIncreaseKeepingSkyline(grid) == 35;
    }
    
    @Test
    public void example2() {
        int[][] grid = {
            {0,0,0},
            {0,0,0},
            {0,0,0},
        };
        assert solution.maxIncreaseKeepingSkyline(grid) == 0;
    }
}
