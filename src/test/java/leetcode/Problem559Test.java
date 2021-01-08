package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem559Test {
    private final Problem559 solution = new Problem559();

    @Test
    public void example1() {
        Node tree = Nodes.of(1, null, 3, 2, 4, null, 5, 6);
        assertThat(solution.maxDepth(tree), is(3));
    }

    @Test
    public void example2() {
        Node tree = Nodes.of(1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14);
        assertThat(solution.maxDepth(tree), is(5));
    }

    @Test
    public void example3() {
        assertThat(solution.maxDepth(null), is(0));
    }
}
