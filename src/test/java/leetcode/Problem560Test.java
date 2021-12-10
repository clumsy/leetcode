package leetcode;

import org.junit.Test;

public class Problem560Test {
    private final Problem560 solution = new Problem560();
    
    @Test
    public void example1() {
        int[] nums = {1,1,1};
        assert solution.subarraySum(nums, 2) == 2;
    }
    
    @Test
    public void example2() {
        int[] nums = {1,2,3};
        assert solution.subarraySum(nums, 3) == 2;
    }
    
    @Test
    public void example3() {
        int[] nums = {2,-2,2,-2};
        assert solution.subarraySum(nums, 4) == 0;
    }
    
    @Test
    public void example4() {
        int[] nums = new int[20000];
        for (int i = 0; i < nums.length; i += 2) {
            nums[i] = 1;
            nums[i + 1] = -1;
        }
        assert solution.subarraySum(nums, 0) == 100000000;
    }
}
