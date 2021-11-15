package leetcode;

import org.junit.Test;

public class Problem572Test {
    private final Problem572 solution = new Problem572();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(3,4,5,1,2);
        TreeNode subRoot = TreeNodes.treeOf(4,1,2);
        assert solution.isSubtree(root, subRoot);
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(3,4,5,1,2,null,null,null,null,0);
        TreeNode subRoot = TreeNodes.treeOf(4,1,2);
        assert !solution.isSubtree(root, subRoot);
    }
    
    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(3,4,5,1,null,2);
        TreeNode subRoot = TreeNodes.treeOf(3,1,2);
        assert !solution.isSubtree(root, subRoot);
    }
}
