package leetcode;

import org.junit.Test;

public class Problem889Test {
    private final Problem889 solution = new Problem889();
    
    @Test
    public void example1() {
        TreeNode expected = TreeNodes.treeOf(1,2,3,4,5,6,7);
        assert solution.constructFromPrePost(new int[] {1,2,4,5,3,6,7}, new int[] {4,5,2,6,7,3,1}).equals(expected);
    }
}
