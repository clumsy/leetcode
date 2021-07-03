package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1380Test {
    private final Problem1380 solution = new Problem1380();
    
    @Test
    public void example1() {
        int[][] matrix = new int[][] {
            {3,7,8},
            {9,11,13},
            {15,16,17}
        };
        assertThat(solution.luckyNumbers(matrix), is(Arrays.asList(15)));
    }
}
