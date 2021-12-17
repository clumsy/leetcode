package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem1038Test {
    private final Problem1038 solution = new Problem1038();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(4,1,6,0,2,5,7,null,null,null,3,null,null,null,8);
        assert Objects.equals(solution.bstToGst(root),
            TreeNodes.treeOf(30,36,21,36,35,26,15,null,null,null,33,null,null,null,8));
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(0,null,1);
        assert Objects.equals(solution.bstToGst(root),
            TreeNodes.treeOf(1,null,1));
    }
    
    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(1,0,2);
        assert Objects.equals(solution.bstToGst(root),
            TreeNodes.treeOf(3,3,2));
    }
    
    @Test
    public void example4() {
        TreeNode root = TreeNodes.treeOf(3,2,4,1);
        assert Objects.equals(solution.bstToGst(root),
            TreeNodes.treeOf(7,9,4,10));
    }
}
