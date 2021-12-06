package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem450Test {
    private final Problem450 solution = new Problem450();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(5,3,6,2,4,null,7);
        assert Objects.equals(solution.deleteNode(root, 3), TreeNodes.treeOf(5,4,6,2,null,null,7));
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(5,3,6,2,4,null,7);
        assert Objects.equals(solution.deleteNode(root, 0), root);
    }
}
