package leetcode;

import org.junit.Test;

public class Problem617Test {
    private final Problem617 solution = new Problem617();

    @Test
    public void example1() {
        TreeNode root1 = TreeNodes.treeOf(2,1,3,null,4,null,7);
        TreeNode root2 = TreeNodes.treeOf(1,3,2,5,null);
        assert solution.mergeTrees(root1, root2).equals(TreeNodes.treeOf(3,4,5,5,4,null,7));
    }

    @Test
    public void example2() {
        TreeNode root1 = TreeNodes.treeOf(1);
        TreeNode root2 = TreeNodes.treeOf(1,2);
        assert solution.mergeTrees(root1, root2).equals(TreeNodes.treeOf(2,2));
    }
}
