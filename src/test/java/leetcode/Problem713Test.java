package leetcode;

import org.junit.Test;

public class Problem713Test {
    private final Problem713 solution = new Problem713();
    
    @Test
    public void example1() {
        int[] nums = {10,5,2,6};
        assert solution.numSubarrayProductLessThanK(nums, 100) == 8;
    }
    
    @Test
    public void example2() {
        int[] nums = {1,2,3};
        assert solution.numSubarrayProductLessThanK(nums, 0) == 0;
    }
    
    @Test
    public void example3() {
        int[] nums = {57,44,92,28,66,60,37,33,52,38,29,76,8,75,22};
        assert solution.numSubarrayProductLessThanK(nums, 18) == 1;
    }
}
