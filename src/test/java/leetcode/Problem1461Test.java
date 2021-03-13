package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1461Test {
    private final Problem1461 solution = new Problem1461();

    @Test
    public void example1() {
        assertThat(solution.hasAllCodes("00110110", 2), is(true));
    }

    @Test
    public void example2() {
        assertThat(solution.hasAllCodes("00110", 2), is(true));
    }

    @Test
    public void example3() {
        assertThat(solution.hasAllCodes("0110", 1), is(true));
    }

    @Test
    public void example4() {
        assertThat(solution.hasAllCodes("0110", 2), is(false));
    }

    @Test
    public void example5() {
        assertThat(solution.hasAllCodes("0000000001011100", 4), is(false));
    }
}
