package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem542Test {
    private final Problem542 solution = new Problem542();
    
    @Test
    public void example1() {
        int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
        assert Arrays.deepEquals(solution.updateMatrix(mat), new int[][] {{0,0,0},{0,1,0},{0,0,0}});
    }
    
    @Test
    public void example2() {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        assert Arrays.deepEquals(solution.updateMatrix(mat), new int[][] {{0,0,0},{0,1,0},{1,2,1}});
    }
    
    @Test
    public void example3() {
        int[][] mat = {{0,1,0,1,1},{1,1,0,0,1},{0,0,0,1,0},{1,0,1,1,1},{1,0,0,0,1}};
        assert Arrays.deepEquals(solution.updateMatrix(mat), new int[][] {{0,1,0,1,2},{1,1,0,0,1},{0,0,0,1,0},{1,0,1,1,1},{1,0,0,0,1}});
    }
    
    @Test
    public void example4() {
        int[][] mat = {{1,1,0,0,1,0,0,1,1,0},{1,0,0,1,0,1,1,1,1,1},{1,1,1,0,0,1,1,1,1,0},{0,1,1,1,0,1,1,1,1,1},{0,0,1,1,1,1,1,1,1,0},{1,1,1,1,1,1,0,1,1,1},{0,1,1,1,1,1,1,0,0,1},{1,1,1,1,1,0,0,1,1,1},{0,1,0,1,1,0,1,1,1,1},{1,1,1,0,1,0,1,1,1,1}};
        assert Arrays.deepEquals(solution.updateMatrix(mat), new int[][] {{2,1,0,0,1,0,0,1,1,0},{1,0,0,1,0,1,1,2,2,1},{1,1,1,0,0,1,2,2,1,0},{0,1,2,1,0,1,2,3,2,1},{0,0,1,2,1,2,1,2,1,0},{1,1,2,3,2,1,0,1,1,1},{0,1,2,3,2,1,1,0,0,1},{1,2,1,2,1,0,0,1,1,2},{0,1,0,1,1,0,1,2,2,3},{1,2,1,0,1,0,1,2,3,4}});
    }
}
