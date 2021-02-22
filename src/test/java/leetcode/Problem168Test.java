package leetcode;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem168Test {
    private final Problem168 solution = new Problem168();

    @Test
    public void example1() {
        assertThat(solution.convertToTitle(1), is("A"));
    }

    @Test
    public void example2() {
        assertThat(solution.convertToTitle(28), is("AB"));
    }

    @Test
    public void example3() {
        assertThat(solution.convertToTitle(701), is("ZY"));
    }
}
