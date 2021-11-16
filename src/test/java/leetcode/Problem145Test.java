package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem145Test {
    private final Problem145 solution = new Problem145();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(1,null,2,3);
        assert Objects.equals(solution.postorderTraversal(root),
            Arrays.asList(3,2,1));
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf();
        assert Objects.equals(solution.postorderTraversal(root),
            Arrays.asList());
    }
    
    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(1);
        assert Objects.equals(solution.postorderTraversal(root),
            Arrays.asList(1));
    }
}
