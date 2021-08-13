package leetcode;

import org.junit.Test;

import static leetcode.Asserts.within;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem50Test {
    private static final double EPSILON = 10e-8;
    private final Problem50 solution = new Problem50();

    @Test
    public void example1() {
        assertThat(solution.myPow(2, 10), is(within(1024.0000, EPSILON)));
    }

    @Test
    public void example2() {
        assertThat(solution.myPow(2.1, 3), is(within(9.2610, EPSILON)));
    }
}
