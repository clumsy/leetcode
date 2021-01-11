package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1448Test {
    private final Problem1448 solution = new Problem1448();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(3,1,4,3,null,1,5);
        assertThat(solution.goodNodes(tree), is(4));
    }

    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(3,3,null,4,2);
        assertThat(solution.goodNodes(tree), is(3));
    }

    @Test
    public void example3() {
        TreeNode tree = TreeNodes.treeOf(1);
        assertThat(solution.goodNodes(tree), is(1));
    }

    @Test
    public void example4() {
        TreeNode tree = TreeNodes.treeOf(9,null,3,6);
        assertThat(solution.goodNodes(tree), is(1));
    }
}
