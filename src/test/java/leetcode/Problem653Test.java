package leetcode;

import org.junit.Test;

public class Problem653Test {
    private final Problem653 solution = new Problem653();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(5,3,6,2,4,null,7);
        assert solution.findTarget(root, 9);
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(5,3,6,2,4,null,7);
        assert !solution.findTarget(root, 28);
    }
    
    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(2,1,3);
        assert solution.findTarget(root, 4);
    }
    
    @Test
    public void example4() {
        TreeNode root = TreeNodes.treeOf(2,1,3);
        assert !solution.findTarget(root, 1);
    }
    
    @Test
    public void example5() {
        TreeNode root = TreeNodes.treeOf(2,1,3);
        assert solution.findTarget(root, 3);
    }
    
    @Test
    public void example6() {
        TreeNode root = TreeNodes.treeOf(1);
        assert !solution.findTarget(root, 2);
    }
}
