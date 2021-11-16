package leetcode;

import org.junit.Test;

public class Problem1091Test {
    private final Problem1091 solution = new Problem1091();
    
    @Test
    public void example1() {
        int[][] grid = {
            {0,1},
            {1,0},
        };
        assert solution.shortestPathBinaryMatrix(grid) == 2;
    }
    
    @Test
    public void example2() {
        int[][] grid = {
            {0,0,0},
            {1,1,0},
            {1,1,0},
        };
        assert solution.shortestPathBinaryMatrix(grid) == 4;
        
    }
    
    @Test
    public void example3() {
        int[][] grid = {
            {1,0,0},
            {1,1,0},
            {1,1,0},
        };
        assert solution.shortestPathBinaryMatrix(grid) == -1;
    }
    
    @Test
    public void example4() {
        int[][] grid = {
            {0,1,1,0,0,0},
            {0,1,0,1,1,0},
            {0,1,1,0,1,0},
            {0,0,0,1,1,0},
            {1,1,1,1,1,0},
            {1,1,1,1,1,0},
        };
        assert solution.shortestPathBinaryMatrix(grid) == 14;
    }
    
    @Test
    public void example5() {
        int[][] grid = {
            {0},
        };
        assert solution.shortestPathBinaryMatrix(grid) == 1;
    }
}
