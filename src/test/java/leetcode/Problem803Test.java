package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem803Test {
    private final Problem803 solution = new Problem803();
    
    @Test
    public void example1() {
        int[][] grid = {{1,0,0,0},{1,1,1,0}};
        int[][] hits = {{1,0}};
        assertThat(solution.hitBricks(grid, hits), is(new int[] {2}));
    }
    
    @Test
    public void example2() {
        int[][] grid = {{1,0,0,0},{1,1,0,0}};
        int[][] hits = {{1,1},{1,0}};
        assertThat(solution.hitBricks(grid, hits), is(new int[] {0,0}));
    }
    
    @Test
    public void example3() {
        int[][] grid = {{1},{1},{1},{1},{1}};
        int[][] hits = {{3,0},{4,0},{1,0},{2,0},{0,0}};
        assertThat(solution.hitBricks(grid, hits), is(new int[] {1,0,1,0,0}));
    }
    
    @Test
    public void example4() {
        int[][] grid = {
            {0,1,1,1,1},
            {1,1,1,1,0},
            {1,1,1,1,0},
            {0,0,1,1,0},
            {0,0,1,0,0},
            {0,0,1,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}
        };
        int[][] hits = {{6,0},{1,0},{4,3},{1,2},{7,1},{6,3},{5,2},{5,1},{2,4},{4,4},{7,3}};
        assertThat(solution.hitBricks(grid, hits), is(new int[] {0,0,0,0,0,0,0,0,0,0,0}));
    }
}
