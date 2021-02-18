package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem55Test {
    private final Problem55 solution = new Problem55();

    @Test
    public void example1() {
        assertThat(solution.canJump(new int[] {2,3,1,1,4}), is(true));
    }

    @Test
    public void example3() {
        assertThat(solution.canJump(new int[] {3,2,1,0,4}), is(false));
    }
}
