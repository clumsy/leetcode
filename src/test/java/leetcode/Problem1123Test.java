package leetcode;

import org.junit.Test;

public class Problem1123Test {
    private final Problem1123 solution = new Problem1123();
    
    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(3,5,1,6,2,0,8,null,null,7,4);
        assert solution.lcaDeepestLeaves(tree).equals(TreeNodes.treeOf(2,7,4));
    }
    
    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(1);
        assert solution.lcaDeepestLeaves(tree).equals(TreeNodes.treeOf(1));
    }
    
    @Test
    public void example3() {
        TreeNode tree = TreeNodes.treeOf(0,1,3,null,2);
        assert solution.lcaDeepestLeaves(tree).equals(TreeNodes.treeOf(2));
    }
    
    @Test
    public void example4() {
        TreeNode tree = TreeNodes.treeOf(1,3,2,14,10,4,6,null,null,null,11,8,5,9,7,null,null,15,null,16,13,null,null,12);
        assert solution.lcaDeepestLeaves(tree).equals(TreeNodes.treeOf(2,4,6,8,5,9,7,15,null,16,13,null,null,12));
    }
    
    @Test
    public void example5() {
        TreeNode tree = TreeNodes.treeOf(1,2,null,3,4,null,6,null,5);
        assert solution.lcaDeepestLeaves(tree).equals(TreeNodes.treeOf(2,3,4,null,6,null,5));
    }
    
    @Test
    public void example6() {
        TreeNode tree = TreeNodes.treeOf(1,2,3,null,4,6,null,15,5,10,null,null,null,null,7,11,null,8,12,null,null,null,9,13,14);
        assert solution.lcaDeepestLeaves(tree).equals(TreeNodes.treeOf(7,8,12,null,9,13,14));
    }
}
