package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem99Test {
    private final Problem99 solution = new Problem99();
    
    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1,3,null,null,2);
        solution.recoverTree(tree);
        assertThat(tree, is(TreeNodes.treeOf(3,1,null,null,2)));
    }
    
    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(3,1,4,null,null,2);
        solution.recoverTree(tree);
        assertThat(tree, is(TreeNodes.treeOf(2,1,4,null,null,3)));
    }
}
