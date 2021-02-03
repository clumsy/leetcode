package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem264Test {
    private final Problem264 solution = new Problem264();

    @Test
    public void example1() {
        assertThat(solution.nthUglyNumber(10), is(12));
    }

    @Test
    public void example2() {
        assertThat(solution.nthUglyNumber(27), is(64));
    }

    @Test
    public void example3() {
        assertThat(solution.nthUglyNumber(103), is(1728));
    }

    @Test
    public void example4() {
        assertThat(solution.nthUglyNumber(1600), is(1399680000));
    }
}
