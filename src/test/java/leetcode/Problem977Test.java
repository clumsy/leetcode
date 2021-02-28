package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem977Test {
    private final Problem977 solution = new Problem977();

    @Test
    public void example1() {
        assertThat(solution.sortedSquares(new int[] {-4,-1,0,3,10}), is(new int[] {0,1,9,16,100}));
    }

    @Test
    public void example2() {
        assertThat(solution.sortedSquares(new int[] {-7,-3,2,3,11}), is(new int[] {4,9,9,49,121}));
    }
}
