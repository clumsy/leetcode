package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem69Test {
    private final Problem69 solution = new Problem69();

    @Test
    public void example1() {
        assertThat(solution.mySqrt(4), is(2));
    }

    @Test
    public void example2() {
        assertThat(solution.mySqrt(8), is(2));
    }

    @Test
    public void example3() {
        assertThat(solution.mySqrt(0), is(0));
    }

    @Test
    public void example4() {
        assertThat(solution.mySqrt(1), is(1));
    }

    @Test
    public void example5() {
        assertThat(solution.mySqrt(2147395599), is(46339));
    }
}
