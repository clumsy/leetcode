package leetcode;

import org.junit.Test;

public class Problem700Test {
    private final Problem700 solution = new Problem700();

    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(4,2,7,1,3);
        assert solution.searchBST(root, 2) == root.left;
    }

    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(4,2,7,1,3);
        assert solution.searchBST(root, 5) == null;
    }
}
