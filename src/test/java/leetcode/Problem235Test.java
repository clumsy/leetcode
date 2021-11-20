package leetcode;

import org.junit.Test;

public class Problem235Test {
    private final Problem235 solution = new Problem235();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(6,2,8,0,4,7,9,null,null,3,5);
        assert solution.lowestCommonAncestor(root, root.left, root.right) == root;
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(6,2,8,0,4,7,9,null,null,3,5);
        assert solution.lowestCommonAncestor(root, root.left, root.left.right) == root.left;
    }
    
    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(2,1);
        assert solution.lowestCommonAncestor(root, root, root.left) == root;
    }
}
