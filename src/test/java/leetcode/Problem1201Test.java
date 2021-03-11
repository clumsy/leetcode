package leetcode;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1201Test {
    private final Problem1201 solution = new Problem1201();

    @Test
    public void example1() {
        assertThat(solution.nthUglyNumber(3, 2, 3, 5), is(4));
    }

    @Test
    public void example2() {
        assertThat(solution.nthUglyNumber(4, 2, 3, 4), is(6));
    }

    @Test
    public void example3() {
        assertThat(solution.nthUglyNumber(5, 2, 11, 13), is(10));
    }

    @Test
    public void example4() {
        assertThat(solution.nthUglyNumber(1000000000, 2, 217983653, 336916467), is(1999999984));
    }

    @Test
    public void example5() {
        assertThat(solution.nthUglyNumber(10, 7, 6, 8), is(28));
    }

    @Test
    public void example6() {
        assertThat(solution.nthUglyNumber(8, 5, 7, 3), is(14));
    }
}
