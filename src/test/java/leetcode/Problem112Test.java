package leetcode;

import org.junit.Test;

public class Problem112Test {
    private final Problem112 solution = new Problem112();

    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(5,4,8,11,null,13,4,7,2,null,1);
        assert solution.hasPathSum(root, 22);
    }

    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(1,2,3);
        assert !solution.hasPathSum(root, 5);
    }

    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(1,2);
        assert !solution.hasPathSum(root, 0);
    }
}
