package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem202Test {
    private final Problem202 solution = new Problem202();

    @Test
    public void example1() {
        assertThat(solution.isHappy(19), is(true));
    }
}
