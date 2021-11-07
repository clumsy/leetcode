package leetcode;

import org.junit.Test;

public class Problem136Test {
    private final Problem136 solution = new Problem136();
    
    @Test
    public void example1() {
        int[] nums = {2,2,1};
        assert solution.singleNumber(nums) == 1;
    }
    
    @Test
    public void example2() {
        int[] nums = {4,1,2,1,2};
        assert solution.singleNumber(nums) == 4;
    }
    
    @Test
    public void example3() {
        int[] nums = {1};
        assert solution.singleNumber(nums) == 1;
    }
}
