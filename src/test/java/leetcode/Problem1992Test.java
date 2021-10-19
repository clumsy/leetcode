package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1992Test {
    private final Problem1992 solution = new Problem1992();
    
    @Test
    public void example1() {
        int[][] land = {
            {1,0,0},
            {0,1,1},
            {0,1,1},
        };
        assertThat(solution.findFarmland(land), is(new int[][] {{0,0,0,0}, {1,1,2,2}}));
    }
    
    @Test
    public void example2() {
        int[][] land = {
            {1,1},
            {1,1},
        };
        assertThat(solution.findFarmland(land), is(new int[][] {{0,0,1,1}}));
    }
    
    @Test
    public void example3() {
        int[][] land = {
            {0},
        };
        assertThat(solution.findFarmland(land), is(new int[0][0]));
    }
    
    @Test
    public void example4() {
        int[][] land = {
            {1,1,1,1,1,1,1,1,1,1,1,1},
        };
        assertThat(solution.findFarmland(land), is(new int[][] {{0,0,0,11}}));
    }
}
