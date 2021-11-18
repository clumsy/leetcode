package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem226Test {
    private final Problem226 solution = new Problem226();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(4,2,7,1,3,6,9);
        assert Objects.equals(solution.invertTree(root), TreeNodes.treeOf(4,7,2,9,6,3,1));
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(2,1,3);
        assert Objects.equals(solution.invertTree(root), TreeNodes.treeOf(2,3,1));
    }
    
    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf();
        assert Objects.equals(solution.invertTree(root), TreeNodes.treeOf());
    }
}
