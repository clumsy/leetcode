package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem343Test {
    private final Problem343 solution = new Problem343();

    @Test
    public void example1() {
        assertThat(solution.integerBreak(2), is(1));
    }

    @Test
    public void example2() {
        assertThat(solution.integerBreak(10), is(36));
    }
}
