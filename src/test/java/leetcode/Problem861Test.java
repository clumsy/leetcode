package leetcode;

import org.junit.Test;

public class Problem861Test {
    private final Problem861 solution = new Problem861();
    
    @Test
    public void example1() {
        int[][] grid = {
            {0,0,1,1},
            {1,0,1,0},
            {1,1,0,0},
        };
        assert solution.matrixScore(grid) == 39;
    }
    
    @Test
    public void example2() {
        int[][] grid = {
            {1},
        };
        assert solution.matrixScore(grid) == 1;
    }
}
