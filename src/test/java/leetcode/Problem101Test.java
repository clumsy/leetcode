package leetcode;

import org.junit.Test;

public class Problem101Test {
    private final Problem101 solution = new Problem101();

    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(1,2,2,3,4,4,3);
        assert solution.isSymmetric(root);
    }

    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(1,2,2,null,3,null,3);
        assert !solution.isSymmetric(root);
    }
}
