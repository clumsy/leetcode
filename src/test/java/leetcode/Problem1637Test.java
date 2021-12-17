package leetcode;

import org.junit.Test;

public class Problem1637Test {
    private final Problem1637 solution = new Problem1637();
    
    @Test
    public void example1() {
        int[][] points = {
            {8,7},
            {9,9},
            {7,4},
            {9,7},
        };
        assert solution.maxWidthOfVerticalArea(points) == 1;
    }
    
    @Test
    public void example2() {
        int[][] points = {
            {3,1},
            {9,0},
            {1,0},
            {1,4},
            {5,3},
            {8,8},
        };
        assert solution.maxWidthOfVerticalArea(points) == 3;
    }
}
