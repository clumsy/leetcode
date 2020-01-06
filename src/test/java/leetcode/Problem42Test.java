package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem42Test {
    private Problem42 solution = new Problem42();

    @Test
    public void simple() {
        assertThat(solution.trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), is(6));
    }

    @Test
    public void empty() {
        assertThat(solution.trap(new int[0]), is(0));
    }
}
