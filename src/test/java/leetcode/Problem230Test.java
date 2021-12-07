package leetcode;

import org.junit.Test;

public class Problem230Test {
    private final Problem230 solution = new Problem230();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(3,1,4,null,2);
        assert solution.kthSmallest(root, 1) == 1;
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(5,3,6,2,4,null,null,1);
        assert solution.kthSmallest(root, 3) == 3;
    }
}
