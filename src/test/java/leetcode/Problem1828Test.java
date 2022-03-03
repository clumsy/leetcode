package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem1828Test {
    private final Problem1828 solution = new Problem1828();
    
    @Test
    public void example1() {
        int[][] points = {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries = {{2,3,1},{4,3,1},{1,1,2}};
        assert Arrays.equals(solution.countPoints(points, queries),
            new int[] {3,2,2});
    }
    
    @Test
    public void example2() {
        int[][] points = {{1,1},{2,2},{3,3},{4,4},{5,5}};
        int[][] queries = {{1,2,2},{2,2,2},{4,3,2},{4,3,3}};
        assert Arrays.equals(solution.countPoints(points, queries),
            new int[] {2,3,2,4});
    }
}
