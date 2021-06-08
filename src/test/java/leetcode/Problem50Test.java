package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem50Test {
    private final Problem50 solution = new Problem50();

    @Test
    public void example1() {
        assertThat(solution.myPow(2, 10), is(1024.));
    }

    @Test
    public void example2() {
        assertThat(Math.abs(solution.myPow(2.1, 3) - 9.261) < 0.00000001d, is(true));
    }
}
