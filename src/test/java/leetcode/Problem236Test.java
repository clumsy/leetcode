package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem236Test {
    private final Problem236 solution = new Problem236();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(3,5,1,6,2,0,8,null,null,7,4);
        assertThat(solution.lowestCommonAncestor(root, root.left, root.right), is(root));
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(3,5,1,6,2,0,8,null,null,7,4);
        assertThat(solution.lowestCommonAncestor(root, root.left, root.left.right.right), is(root.left));
    }
    
    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(1,2);
        assertThat(solution.lowestCommonAncestor(root, root, root.left), is(root));
    }
    
    @Test
    public void example4() {
        TreeNode root = TreeNodes.treeOf(9,-1,-4,10,3,null,null,null,5);
        assertThat(solution.lowestCommonAncestor(root, root.left.right, root.left.left.right), is(root.left));
    }
}
