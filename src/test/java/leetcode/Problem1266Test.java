package leetcode;

import org.junit.Test;

public class Problem1266Test {
    private final Problem1266 solution = new Problem1266();
    
    @Test
    public void example1() {
        int[][] points = {{1,1},{3,4},{-1,0}};
        assert solution.minTimeToVisitAllPoints(points) == 7;
    }
    
    @Test
    public void example2() {
        int[][] points = {{3,2},{-2,2}};
        assert solution.minTimeToVisitAllPoints(points) == 5;
    }
}
