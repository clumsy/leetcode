package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem263Test {
    private final Problem263 solution = new Problem263();

    @Test
    public void example1() {
        assertThat(solution.isUgly(6), is(true));
    }

    @Test
    public void example2() {
        assertThat(solution.isUgly(8), is(true));
    }

    @Test
    public void example3() {
        assertThat(solution.isUgly(14), is(false));
    }

    @Test
    public void example4() {
        assertThat(solution.isUgly(0), is(false));
    }
}
