package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem814Test {
    private final Problem814 solution = new Problem814();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1,null,0,0,1);
        assertThat(solution.pruneTree(tree), is(TreeNodes.treeOf(1,null,0,null,1)));
    }

    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(1,0,1,0,0,0,1);
        assertThat(solution.pruneTree(tree), is(TreeNodes.treeOf(1,null,1,null,1)));
    }

    @Test
    public void example3() {
        TreeNode tree = TreeNodes.treeOf(1,1,0,1,1,0,1,0);
        assertThat(solution.pruneTree(tree), is(TreeNodes.treeOf(1,1,0,1,1,null,1)));
    }
}
