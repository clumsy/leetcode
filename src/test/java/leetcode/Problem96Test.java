package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem96Test {
    private final Problem96 solution = new Problem96();

    @Test
    public void example1() {
        assertThat(solution.numTrees(3), is(5));
    }

    @Test
    public void example2() {
        assertThat(solution.numTrees(1), is(1));
    }
}
