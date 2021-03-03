package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem91Test {
    private final Problem91 solution = new Problem91();

    @Test
    public void example1() {
        assertThat(solution.numDecodings("12"), is(2));
    }

    @Test
    public void example2() {
        assertThat(solution.numDecodings("226"), is(3));
    }

    @Test
    public void example3() {
        assertThat(solution.numDecodings("0"), is(0));
    }

    @Test
    public void example4() {
        assertThat(solution.numDecodings("06"), is(0));
    }

    @Test
    public void example5() {
        assertThat(solution.numDecodings("1201234"), is(3));
    }

    @Test
    public void example6() {
        assertThat(solution.numDecodings("123123"), is(9));
    }

    @Test
    public void example7() {
        assertThat(solution.numDecodings("207"), is(1));
    }

    @Test
    public void example8() {
        assertThat(solution.numDecodings("230"), is(0));
    }
}
