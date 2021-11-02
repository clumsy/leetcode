package leetcode;

import org.junit.Test;

public class Problem994Test {
    private final Problem994 solution = new Problem994();
    
    @Test
    public void example1() {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        assert solution.orangesRotting(grid) == 4;
    }
    
    @Test
    public void example2() {
        int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
        assert solution.orangesRotting(grid) == -1;
    }
    
    @Test
    public void example3() {
        int[][] grid = {{0,2}};
        assert solution.orangesRotting(grid) == 0;
    }
}
