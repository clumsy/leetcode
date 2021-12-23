package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem1382Test {
    private final Problem1382 solution = new Problem1382();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(1,null,2,null,3,null,4,null,null);
        assert Objects.equals(solution.balanceBST(root),
            TreeNodes.treeOf(2,1,3,null,null,null,4));
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(2,1,3);
        assert Objects.equals(solution.balanceBST(root),
            root);
    }
}
