package leetcode;

import org.junit.Test;

public class Problem2044Test {
    private final Problem2044 solution = new Problem2044();
    
    @Test
    public void example1() {
        int[] nums = {3,1};
        assert solution.countMaxOrSubsets(nums) == 2;
    }
    
    @Test
    public void example2() {
        int[] nums = {2,2,2};
        assert solution.countMaxOrSubsets(nums) == 7;
    }
    
    @Test
    public void example3() {
        int[] nums = {3,2,1,5};
        assert solution.countMaxOrSubsets(nums) == 6;
    }
    
    @Test
    public void example4() {
        int[] nums = {88};
        assert solution.countMaxOrSubsets(nums) == 1;
    }
}
