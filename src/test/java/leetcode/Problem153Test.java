package leetcode;

import org.junit.Test;

public class Problem153Test {
    private final Problem153 solution = new Problem153();
    
    @Test
    public void example1() {
        int[] nums = {3, 4, 5, 1, 2};
        assert solution.findMin(nums) == 1;
    }
    
    @Test
    public void example2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assert solution.findMin(nums) == 0;
    }
    
    @Test
    public void example3() {
        int[] nums = {11, 13, 15, 17};
        assert solution.findMin(nums) == 11;
    }
    
    @Test
    public void example4() {
        int[] nums = {2, 1};
        assert solution.findMin(nums) == 1;
    }
}
