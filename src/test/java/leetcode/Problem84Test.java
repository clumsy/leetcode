package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem84Test {
    private final Problem84 solution = new Problem84();

    @Test
    public void example1() {
        assertThat(solution.largestRectangleArea(new int[] {2,1,5,6,2,3}), is(10));
    }

    @Test
    public void example2() {
        assertThat(solution.largestRectangleArea(new int[] {2,4}), is(4));
    }
}
