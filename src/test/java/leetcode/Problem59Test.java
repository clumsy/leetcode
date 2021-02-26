package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem59Test {
    private final Problem59 solution = new Problem59();

    @Test
    public void example1() {
        assertThat(solution.generateMatrix(3),
            is(new int[][] {
                {1,2,3},
                {8,9,4},
                {7,6,5}
            }));
    }
}
