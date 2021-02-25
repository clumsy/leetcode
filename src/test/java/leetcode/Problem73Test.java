package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem73Test {
    private final Problem73 solution = new Problem73();

    @Test
    public void example1() {
        int[][] matrix = new int[][] {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        solution.setZeroes(matrix);
        assertThat(matrix,
            is(new int[][] {
                {1,0,1},
                {0,0,0},
                {1,0,1}
            }));
    }

    @Test
    public void example2() {
        int[][] matrix = new int[][] {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
        solution.setZeroes(matrix);
        assertThat(matrix,
            is(new int[][] {
                {0,0,0,0},
                {0,4,5,0},
                {0,3,1,0}
            }));
    }
}
