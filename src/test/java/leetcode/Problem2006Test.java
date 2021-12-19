package leetcode;

import org.junit.Test;

public class Problem2006Test {
    private final Problem2006 solution = new Problem2006();
    
    @Test
    public void example1() {
        int[] nums = {1,2,2,1};
        assert solution.countKDifference(nums, 1) == 4;
    }
    
    @Test
    public void example2() {
        int[] nums = {1,3};
        assert solution.countKDifference(nums, 3) == 0;
    }
    
    @Test
    public void example3() {
        int[] nums = {3,2,1,5,4};
        assert solution.countKDifference(nums, 2) == 3;
    }
}
