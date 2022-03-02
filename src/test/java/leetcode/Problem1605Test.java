package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem1605Test {
    private final Problem1605 solution = new Problem1605();
    
    @Test
    public void example1() {
        int[] row = {3,8};
        int[] col = {4,7};
        assert Arrays.deepEquals(solution.restoreMatrix(row, col),
            new int[][] {
                {3,0},
                {1,7},
            });
    }
    
    @Test
    public void example2() {
        int[] row = {5,7,10};
        int[] col = {8,6,8};
        assert Arrays.deepEquals(solution.restoreMatrix(row, col),
            new int[][] {
                {5,0,0},
                {3,4,0},
                {0,2,8},
            });
    }
}
