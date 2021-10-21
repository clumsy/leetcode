package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem2017Test {
    private final Problem2017 solution = new Problem2017();
    
    @Test
    public void example1() {
        int[][] grid = {
            {2,5,4},
            {1,5,1},
        };
        assertThat(solution.gridGame(grid), is(4L));
    }
    
    @Test
    public void example2() {
        int[][] grid = {
            {3,3,1},
            {8,5,2},
        };
        assertThat(solution.gridGame(grid), is(4L));
    }
    
    @Test
    public void example3() {
        int[][] grid = {
            {1,3,1,15},
            {1,3,3,1},
        };
        assertThat(solution.gridGame(grid), is(7L));
    }
    
    @Test
    public void example4() {
        int[][] grid = {
            {20,3,20,17,2,12,15,17,4,15},
            {20,10,13,14,15,5,2,3,14,3},
        };
        assertThat(solution.gridGame(grid), is(63L));
    }
}
