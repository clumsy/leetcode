package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem865Test {
    private final Problem865 solution = new Problem865();
    
    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(3,5,1,6,2,0,8,null,null,7,4);
        assertThat(solution.subtreeWithAllDeepest(tree), is(tree.left.right));
    }
    
    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(1);
        assertThat(solution.subtreeWithAllDeepest(tree), is(tree));
    }
    
    @Test
    public void example3() {
        TreeNode tree = TreeNodes.treeOf(0,1,3,null,2);
        assertThat(solution.subtreeWithAllDeepest(tree), is(tree.left.right));
    }
}
