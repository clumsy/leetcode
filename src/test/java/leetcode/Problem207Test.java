package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem207Test {
    private final Problem207 solution = new Problem207();

    @Test
    public void example1() {
        assertThat(solution.canFinish(2, new int[][] {{1,0}}), is(true));
    }

    @Test
    public void example2() {
        assertThat(solution.canFinish(2, new int[][] {{1,0},{0,1}}), is(false));
    }
}
