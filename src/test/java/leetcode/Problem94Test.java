package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem94Test {
    private Problem94 solution = new Problem94();

    @Test
    public void simple() {
        assertThat(solution.inorderTraversal(treeOf(1, null, 2, 3, null)), is(asList(1, 3, 2)));
    }

    @Test
    public void another() {
        assertThat(solution.inorderTraversal(treeOf(2, 3, null, 1)), is(asList(1, 3, 2)));
    }

    @Test
    public void single() {
        assertThat(solution.inorderTraversal(treeOf(1)), is(singletonList(1)));
    }
}
