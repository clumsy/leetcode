package leetcode;

import org.junit.Test;

public class Problem236Test {
    private final Problem236 solution = new Problem236();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(3,5,1,6,2,0,8,null,null,7,4);
        assert solution.lowestCommonAncestor(root, root.left, root.right) == root;
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(3,5,1,6,2,0,8,null,null,7,4);
        assert solution.lowestCommonAncestor(root, root.left, root.left.right.right) == root.left;
    }
    
    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(1,2);
        assert solution.lowestCommonAncestor(root, root, root.left) == root;
    }
    
    @Test
    public void example4() {
        TreeNode root = TreeNodes.treeOf(9,-1,-4,10,3,null,null,null,5);
        assert solution.lowestCommonAncestor(root, root.left.right, root.left.left.right) == root.left;
    }
}
