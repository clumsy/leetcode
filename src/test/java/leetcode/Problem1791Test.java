package leetcode;

import org.junit.Test;

public class Problem1791Test {
    private final Problem1791 solution = new Problem1791();
    
    @Test
    public void example1() {
        int[][] edges = {{1,2},{2,3},{4,2}};
        assert solution.findCenter(edges) == 2;
    }
    
    @Test
    public void example2() {
        int[][] edges = {{1,2},{5,1},{1,3},{1,4}};
        assert solution.findCenter(edges) == 1;
    }
}
