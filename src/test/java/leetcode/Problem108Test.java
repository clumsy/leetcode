package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem108Test {
    private final Problem108 solution = new Problem108();
    
    @Test
    public void example1() {
        int[] nums = {-10,-3,0,5,9};
        assert Objects.equals(solution.sortedArrayToBST(nums), TreeNodes.treeOf(0,-10,5,null,-3,null,9));
    }
    
    @Test
    public void example2() {
        int[] nums = {1,3};
        assert Objects.equals(solution.sortedArrayToBST(nums), TreeNodes.treeOf(1,null,3));
    }
}
