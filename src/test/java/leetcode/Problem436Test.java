package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem436Test {
    private final Problem436 solution = new Problem436();
    
    @Test
    public void example1() {
        int[][] intervals = {{1,2}};
        assert Arrays.equals(solution.findRightInterval(intervals), new int[] {-1});
    }
    
    @Test
    public void example2() {
        int[][] intervals = {{3,4},{2,3}, {1,2}};
        assert Arrays.equals(solution.findRightInterval(intervals), new int[] {-1,0,1});
    }
    
    @Test
    public void example3() {
        int[][] intervals = {{1,4},{2,3},{3,4}};
        assert Arrays.equals(solution.findRightInterval(intervals), new int[] {-1,2,-1});
    }
}
