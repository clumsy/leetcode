package leetcode;

import org.junit.Test;

public class Problem538Test {
    private final Problem538 solution = new Problem538();
    
    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(4,1,6,0,2,5,7,null,null,null,3,null,null,null,8);
        TreeNode expected = TreeNodes.treeOf(30,36,21,36,35,26,15,null,null,null,33,null,null,null,8);
        assert solution.convertBST(tree).equals(expected);
    }
    
    @Test
    public void example2() {
        TreeNode tree = TreeNodes.treeOf(0,null,1);
        TreeNode expected = TreeNodes.treeOf(1,null,1);
        assert solution.convertBST(tree).equals(expected);
    }
    
    @Test
    public void example3() {
        TreeNode tree = TreeNodes.treeOf(1,0,2);
        TreeNode expected = TreeNodes.treeOf(3,3,2);
        assert solution.convertBST(tree).equals(expected);
    }
    
    @Test
    public void example4() {
        TreeNode tree = TreeNodes.treeOf(3,2,4,1);
        TreeNode expected = TreeNodes.treeOf(7,9,4,10);
        assert solution.convertBST(tree).equals(expected);
    }
}
