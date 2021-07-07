package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1886Test {
    private final Problem1886 solution = new Problem1886();
    
    @Test
    public void example1() {
        int[][] matrix = {
            {0,1},
            {1,0}
        };
        int[][] target = {
            {1,0},
            {0,1},
        };
        assertThat(solution.findRotation(matrix, target), is(true));
    }
}
