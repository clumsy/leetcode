package leetcode;

import org.junit.Test;

public class Problem1379Test {
    private final Problem1379 solution = new Problem1379();
    
    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(7,4,3,null,null,6,19);
        assert solution.getTargetCopy(tree, tree, tree.right.left) == tree.right.left;
    }
    
    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(7);
        assert solution.getTargetCopy(tree, tree, tree) == tree;
    }
    
    @Test
    public void example3() {
        TreeNode tree = TreeNodes.treeOf(8,null,6,null,5,null,4,null,3,null,2,null,1);
        assert solution.getTargetCopy(tree, tree, tree.right.right.right) == tree.right.right.right;
    }
    
    @Test
    public void example4() {
        TreeNode tree = TreeNodes.treeOf(1,2,3,4,5,6,7,8,9,10);
        assert solution.getTargetCopy(tree, tree, tree.left.right) == tree.left.right;
    }
    
    @Test
    public void example5() {
        TreeNode tree = TreeNodes.treeOf(1,2,null,3);
        assert solution.getTargetCopy(tree, tree, tree.left) == tree.left;
    }
}
