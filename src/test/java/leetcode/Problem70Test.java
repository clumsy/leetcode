package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem70Test {
    private final Problem70 solution = new Problem70();

    @Test
    public void example1() {
        assertThat(solution.climbStairs(2), is(2));
    }

    @Test
    public void example2() {
        assertThat(solution.climbStairs(3), is(3));
    }
}
