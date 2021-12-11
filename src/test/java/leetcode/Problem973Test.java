package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem973Test {
    private final Problem973 solution = new Problem973();
    
    @Test
    public void example1() {
        int[][] points = {{1,3},{-2,2}};
        assert Arrays.deepEquals(solution.kClosest(points, 1), new int[][]{{-2,2}});
    }
    
    @Test
    public void example2() {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        assert Arrays.deepEquals(solution.kClosest(points, 2), new int[][] {{3,3},{-2,4}});
    }
}
