package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem1314Test {
    private final Problem1314 solution = new Problem1314();
    
    @Test
    public void example1() {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        assert Arrays.deepEquals(solution.matrixBlockSum(mat, 1),
            new int[][] {
                {12,21,16},
                {27,45,33},
                {24,39,28},
            });
    }
    
    @Test
    public void example2() {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        assert Arrays.deepEquals(solution.matrixBlockSum(mat, 2),
            new int[][] {
                {45,45,45},
                {45,45,45},
                {45,45,45},
            });
    }
}
