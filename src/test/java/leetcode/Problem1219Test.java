package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1219Test {
    private final Problem1219 solution = new Problem1219();
    
    @Test
    public void example1() {
        int[][] grid =
            {
                {0,6,0},
                {5,8,7},
                {0,9,0}
            };
        assertThat(solution.getMaximumGold(grid), is(24));
    }
    
    @Test
    public void example2() {
        int[][] grid =
            {
                {1,0,7},
                {2,0,6},
                {3,4,5},
                {0,3,0},
                {9,0,20}
            };
        assertThat(solution.getMaximumGold(grid), is(28));
    }
}
