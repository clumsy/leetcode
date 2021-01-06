package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem965Test {
    private final Problem965 solution = new Problem965();

    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(1,1,1,1,1,null,1);
        assertThat(solution.isUnivalTree(root), is(true));
    }

    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(2,2,2,5,2);
        assertThat(solution.isUnivalTree(root), is(false));
    }
}
