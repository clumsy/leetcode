package leetcode;

import org.junit.Test;

public class Problem169Test {
    private final Problem169 solution = new Problem169();
    
    @Test
    public void example1() {
        int[] nums = {10,9,9,9,10};
        assert solution.majorityElement(nums) == 9;
    }
    
    @Test
    public void example2() {
        int[] nums = {1,3,1,1,4,1,1,5,1,1,6,2,2};
        assert solution.majorityElement(nums) == 1;
    }
    
    @Test
    public void example3() {
        int[] nums = {3,2,3};
        assert solution.majorityElement(nums) == 3;
    }
    
    @Test
    public void example4() {
        int[] nums = {2,2,1,1,1,2,2};
        assert solution.majorityElement(nums) == 2;
    }
}
