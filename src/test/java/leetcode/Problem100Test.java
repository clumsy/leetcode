package leetcode;

import org.junit.Test;

import static leetcode.TreeNodes.treeOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem100Test {
    private final Problem100 solution = new Problem100();

    @Test
    public void same() {
        TreeNode tree = treeOf(1, 2, 3);
        assertThat(solution.isSameTree(tree, tree), is(true));
    }

    @Test
    public void isNull() {
        assertThat(solution.isSameTree(null, null), is(true));
    }

    @Test
    public void hasNull() {
        TreeNode tree = treeOf(1, null, 2);
        assertThat(solution.isSameTree(tree, tree), is(true));
    }
}
