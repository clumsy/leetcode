package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem547Test {
    private final Problem547 solution = new Problem547();
    
    @Test
    public void example1() {
        int[][] isConnected = {
            {1,1,0},
            {1,1,0},
            {0,0,1},
        };
        assertThat(solution.findCircleNum(isConnected), is(2));
    }
    
    @Test
    public void example2() {
        int[][] isConnected = {
            {1,0,0},
            {0,1,0},
            {0,0,1},
        };
        assertThat(solution.findCircleNum(isConnected), is(3));
    }
}
