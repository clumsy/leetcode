package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem172Test {
    private final Problem172 solution = new Problem172();

    @Test
    public void example1() {
        assertThat(solution.trailingZeroes(3), is(0));
    }

    @Test
    public void example2() {
        assertThat(solution.trailingZeroes(5), is(1));
    }
}
