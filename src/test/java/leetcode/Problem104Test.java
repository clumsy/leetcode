package leetcode;

import org.junit.Test;

public class Problem104Test {
    private final Problem104 solution = new Problem104();

    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(3,9,20,null,null,15,7);
        assert solution.maxDepth(root) == 3;
    }

    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(1,null,2);
        assert solution.maxDepth(root) == 2;
    }

    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf();
        assert solution.maxDepth(root) == 0;
    }

    @Test
    public void example4() {
        TreeNode root = TreeNodes.treeOf(0);
        assert solution.maxDepth(root) == 1;
    }
}
