package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem89Test {
    private final Problem89 solution = new Problem89();

    @Test
    public void example1() {
        assertThat(solution.grayCode(2), is(Arrays.asList(0, 1, 3, 2)));
    }

    @Test
    public void example2() {
        assertThat(solution.grayCode(1), is(Arrays.asList(0, 1)));
    }
}
