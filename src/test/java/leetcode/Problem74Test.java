package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem74Test {
    private final Problem74 solution = new Problem74();

    @Test
    public void example1() {
        int[][] matrix = new int[][] {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        assertThat(solution.searchMatrix(matrix, 3), is(true));
    }
}
