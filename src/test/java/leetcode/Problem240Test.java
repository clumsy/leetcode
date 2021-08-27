package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem240Test {
    private final Problem240 solution = new Problem240();
    
    @Test
    public void example1() {
        int[][] matrix = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17},
            {18,21,23,26,30},
        };
        assertThat(solution.searchMatrix(matrix, 5), is(true));
    }
    
    @Test
    public void example2() {
        int[][] matrix = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30},
        };
        assertThat(solution.searchMatrix(matrix, 20), is(false));
    }
    
    @Test
    public void example3() {
        int[][] matrix = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25},
        };
        assertThat(solution.searchMatrix(matrix, 5), is(true));
    }
}
