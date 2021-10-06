package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem498Test {
    private final Problem498 solution = new Problem498();
    
    @Test
    public void example1() {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int[] ans = {1,2,4,7,5,3,6,8,9};
        assertThat(solution.findDiagonalOrder(mat), is(ans));
    }
    
    @Test
    public void example2() {
        int[][] mat = {
            {1,2},
            {3,4},
        };
        int[] ans = {1,2,3,4};
        assertThat(solution.findDiagonalOrder(mat), is(ans));
    }
}
