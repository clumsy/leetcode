package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem1305Test {
    private final Problem1305 solution = new Problem1305();
    
    @Test
    public void example1() {
        TreeNode root1 = TreeNodes.treeOf(2,1,4);
        TreeNode root2 = TreeNodes.treeOf(1,0,3);
        assert Objects.equals(solution.getAllElements(root1, root2),
            Arrays.asList(0,1,1,2,3,4));
    }
    
    @Test
    public void example2() {
        TreeNode root1 = TreeNodes.treeOf(1,null,8);
        TreeNode root2 = TreeNodes.treeOf(8,1);
        assert Objects.equals(solution.getAllElements(root1, root2),
            Arrays.asList(1,1,8,8));
    }
    
    @Test
    public void example3() {
        TreeNode root1 = TreeNodes.treeOf(0,null,59,57,90);
        TreeNode root2 = TreeNodes.treeOf(60,17,74,6,20,63,97,null,null,null,null,null,null,95);
        assert Objects.equals(solution.getAllElements(root1, root2),
            Arrays.asList(0,6,17,20,57,59,60,63,74,90,95,97));
    }
}
