package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem437Test {
    private final Problem437 solution = new Problem437();

    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(10,5,-3,3,2,null,11,3,-2,null,1);
        assertThat(solution.pathSum(tree, 8), is(3));
    }

    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(1,2);
        assertThat(solution.pathSum(tree, 2), is(1));
    }

    @Test
    public void example3() {
        TreeNode tree = TreeNodes.treeOf(1,null,2,null,3,null,4,null,5);
        assertThat(solution.pathSum(tree, 3), is(2));
    }

    @Test
    public void example4() {
        TreeNode tree = TreeNodes.treeOf(-8,6,8,null,null,8,2,null,null,null,-2);
        assertThat(solution.pathSum(tree, -2), is(2));
    }
}
