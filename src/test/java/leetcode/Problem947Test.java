package leetcode;

import org.junit.Test;

public class Problem947Test {
    private final Problem947 solution = new Problem947();
    
    @Test
    public void example1() {
        int[][] stones = {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
        assert solution.removeStones(stones) == 5;
    }
    
    @Test
    public void example2() {
        int[][] stones = {{0,0},{0,2},{1,1},{2,0},{2,2}};
        assert solution.removeStones(stones) == 3;
    }
    
    @Test
    public void example3() {
        int[][] stones = {{0,0}};
        assert solution.removeStones(stones) == 0;
    }
    
    @Test
    public void example4() {
        int[][] stones = {{3,2},{0,0},{3,3},{2,1},{2,3},{2,2},{0,2}};
        assert solution.removeStones(stones) == 6;
    }
}
