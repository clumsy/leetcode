package leetcode;

import org.junit.Test;

public class Problem783Test {
    private final Problem783 solution = new Problem783();
    
    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(1,0,48,null,null,12,49);
        assert solution.minDiffInBST(tree) == 1;
    }
    
    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(4,2,6,1,3);
        assert solution.minDiffInBST(tree) == 1;
    }
    
    @Test
    public void example3() {
        TreeNode tree = TreeNodes.treeOf(27,null,34,null,58,50,null,44);
        assert solution.minDiffInBST(tree) == 6;
    }
    
    @Test
    public void example4() {
        TreeNode tree = TreeNodes.treeOf(5,1,7);
        assert solution.minDiffInBST(tree) == 2;
    }
    
    @Test
    public void example5() {
        TreeNode tree = TreeNodes.treeOf(56,42,77,23,51,75,90,null,null,null,null,67,null,78,99);
        assert solution.minDiffInBST(tree) == 1;
    }
}
