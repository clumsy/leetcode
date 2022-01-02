package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem1325Test {
    private final Problem1325 solution = new Problem1325();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(1,2,3,2,null,2,4);
        assert Objects.equals(solution.removeLeafNodes(root, 2),
            TreeNodes.treeOf(1,null,3,null,4));
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(1,3,3,3,2);
        assert Objects.equals(solution.removeLeafNodes(root, 3),
            TreeNodes.treeOf(1,3,null,null,2));
    }
    
    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(1,2,null,2,null,2);
        assert Objects.equals(solution.removeLeafNodes(root, 2),
            TreeNodes.treeOf(1));
    }
}
