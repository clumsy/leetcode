package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1306Test {
    private final Problem1306 solution = new Problem1306();

    @Test
    public void example1() {
        assertThat(solution.canReach(new int[] {4,2,3,0,3,1,2}, 5), is(true));
    }

    @Test
    public void example2() {
        assertThat(solution.canReach(new int[] {4,2,3,0,3,1,2}, 0), is(true));
    }

    @Test
    public void example3() {
        assertThat(solution.canReach(new int[] {3,0,2,1,2}, 2), is(false));
    }
}
