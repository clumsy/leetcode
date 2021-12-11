package leetcode;

import org.junit.Test;

public class Problem435Test {
    private final Problem435 solution = new Problem435();
    
    @Test
    public void example1() {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        assert solution.eraseOverlapIntervals(intervals) == 1;
    }
    
    @Test
    public void example2() {
        int[][] intervals = {{1,2},{1,2},{1,2}};
        assert solution.eraseOverlapIntervals(intervals) == 2;
    }
    
    @Test
    public void example3() {
        int[][] intervals = {{1,2},{2,3}};
        assert solution.eraseOverlapIntervals(intervals) == 0;
    }
}
