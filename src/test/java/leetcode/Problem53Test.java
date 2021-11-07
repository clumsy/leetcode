package leetcode;

import org.junit.Test;

public class Problem53Test {
    private final Problem53 solution = new Problem53();
    
    @Test
    public void example1() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        assert solution.maxSubArray(nums) == 6;
    }
    
    @Test
    public void example2() {
        int[] nums = {1};
        assert solution.maxSubArray(nums) == 1;
    }
    
    @Test
    public void example3() {
        int[] nums = {5,4,-1,7,8};
        assert solution.maxSubArray(nums) == 23;
    }
    
    @Test
    public void example4() {
        int[] nums = {-1};
        assert solution.maxSubArray(nums) == -1;
    }
}
