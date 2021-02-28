package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem231Test {
    private final Problem231 solution = new Problem231();

    @Test
    public void example1() {
        assertThat(solution.isPowerOfTwo(1), is(true));
    }

    @Test
    public void example2() {
        assertThat(solution.isPowerOfTwo(16), is(true));
    }

    @Test
    public void example3() {
        assertThat(solution.isPowerOfTwo(3), is(false));
    }

    @Test
    public void example4() {
        assertThat(solution.isPowerOfTwo(4), is(true));
    }

    @Test
    public void example5() {
        assertThat(solution.isPowerOfTwo(5), is(false));
    }

    @Test
    public void example6() {
        assertThat(solution.isPowerOfTwo(0), is(false));
    }

    @Test
    public void example7() {
        assertThat(solution.isPowerOfTwo(Integer.MIN_VALUE), is(false));
    }
}
