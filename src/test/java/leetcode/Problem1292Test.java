package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1292Test {
    private final Problem1292 solution = new Problem1292();
    
    @Test
    public void example1() {
        int[][] matrix = {
            {1,1,3,2,4,3,2},
            {1,1,3,2,4,3,2},
            {1,1,3,2,4,3,2}
        };
        assertThat(solution.maxSideLength(matrix, 4), is(2));
    }
    
    @Test
    public void example2() {
        int[][] matrix = {
            {2,2,2,2,2},
            {2,2,2,2,2},
            {2,2,2,2,2}
        };
        assertThat(solution.maxSideLength(matrix, 1), is(0));
    }
}
