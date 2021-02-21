package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem66Test {
    private final Problem66 solution = new Problem66();

    @Test
    public void example1() {
        assertThat(solution.plusOne(new int[] {1,2,3}), is(new int[] {1,2,4}));
    }

    @Test
    public void example2() {
        assertThat(solution.plusOne(new int[] {4,3,2,1}), is(new int[] {4,3,2,2}));
    }

    @Test
    public void example3() {
        assertThat(solution.plusOne(new int[] {0}), is(new int[] {1}));
    }
}
