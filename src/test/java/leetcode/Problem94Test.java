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
        TreeNode tree = treeOf(1, null, treeOf(2, treeOf(3), null));
        assertThat(solution.inorderTraversal(tree), is(asList(1, 3, 2)));
    }

    @Test
    public void another() {
        TreeNode tree = treeOf(2, treeOf(3, treeOf(1), null), null);
        assertThat(solution.inorderTraversal(tree), is(asList(1, 3, 2)));
    }

    @Test
    public void single() {
        TreeNode tree = treeOf(1);
        assertThat(solution.inorderTraversal(tree), is(singletonList(1)));
    }
}
