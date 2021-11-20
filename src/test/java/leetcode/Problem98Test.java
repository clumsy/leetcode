package leetcode;

import org.junit.Test;

public class Problem98Test {
    private final Problem98 solution = new Problem98();

    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(2,1,3);
        assert solution.isValidBST(root);
    }

    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(5,1,4,null,null,3,6);
        assert !solution.isValidBST(root);
    }

    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(1,1,null);
        assert !solution.isValidBST(root);
    }

    @Test
    public void example4() {
        TreeNode root = TreeNodes.treeOf(10,5,15,null,null,6,20);
        assert !solution.isValidBST(root);
    }

    @Test
    public void example5() {
        TreeNode root = TreeNodes.treeOf();
        assert solution.isValidBST(root);
    }

    @Test
    public void example6() {
        TreeNode root = TreeNodes.treeOf(3, 1, 5, 0, 2, 4, 6);
        assert solution.isValidBST(root);
    }

    @Test
    public void example7() {
        TreeNode root = TreeNodes.treeOf(Integer.MAX_VALUE);
        assert solution.isValidBST(root);
    }

    @Test
    public void example8() {
        TreeNode root = TreeNodes.treeOf(3,1,5,0,2,4,6,null,null,null,3);
        assert !solution.isValidBST(root);
    }

}
