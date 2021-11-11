package leetcode;

import org.junit.Test;

public class Problem1261Test {
    private final Problem1261 solution = new Problem1261();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(-1,null,-1);
        Problem1261.FindElements findElements = solution.new FindElements(root);
        assert !findElements.find(1);
        assert findElements.find(2);
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(-1,-1,-1,-1,-1);
        Problem1261.FindElements findElements = solution.new FindElements(root);
        assert findElements.find(1);
        assert findElements.find(3);
        assert !findElements.find(5);
    }
}
