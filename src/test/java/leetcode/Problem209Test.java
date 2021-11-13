package leetcode;

import org.junit.Test;

public class Problem209Test {
    private final Problem209 solution = new Problem209();
    
    @Test
    public void example1() {
        int[] nums = {2,3,1,2,4,3};
        assert solution.minSubArrayLen(7, nums) == 2;
    }
    
    @Test
    public void example2() {
        int[] nums = {1,4,4};
        assert solution.minSubArrayLen(4, nums) == 1;
    }
    
    @Test
    public void example3() {
        int[] nums = {1,1,1,1,1,1,1,1};
        assert solution.minSubArrayLen(11, nums) == 0;
    }
}
