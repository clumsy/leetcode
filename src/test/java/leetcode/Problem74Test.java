package leetcode;

import org.junit.Test;

public class Problem74Test {
    private final Problem74 solution = new Problem74();

    @Test
    public void example1() {
        int[][] matrix = new int[][] {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        assert solution.searchMatrix(matrix, 3);
    }

    @Test
    public void example2() {
        int[][] matrix = new int[][] {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        assert !solution.searchMatrix(matrix, 13);
    }
}
