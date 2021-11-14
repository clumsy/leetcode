package leetcode;

import org.junit.Test;

public class Problem547Test {
    private final Problem547 solution = new Problem547();
    
    @Test
    public void example1() {
        int[][] isConnected = {
            {1,1,0},
            {1,1,0},
            {0,0,1},
        };
        assert solution.findCircleNum(isConnected) == 2;
    }
    
    @Test
    public void example2() {
        int[][] isConnected = {
            {1,0,0},
            {0,1,0},
            {0,0,1},
        };
        assert solution.findCircleNum(isConnected) == 3;
    }
}
