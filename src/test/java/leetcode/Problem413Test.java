package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem413Test {
    private final Problem413 solution = new Problem413();

    @Test
    public void example1() {
        assertThat(solution.numberOfArithmeticSlices(new int[] {1,2,3,4}), is(3));
    }

    @Test
    public void example2() {
        assertThat(solution.numberOfArithmeticSlices(new int[] {1}), is(0));
    }

    @Test
    public void example3() {
        assertThat(solution.numberOfArithmeticSlices(new int[] {1,2,3,8,9,10}), is(2));
    }
}
