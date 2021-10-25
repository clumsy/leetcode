package leetcode;

import org.junit.Test;

public class Problem35Test {
    private final Problem35 solution = new Problem35();
    
    @Test
    public void example1() {
        int[] nums = {1,3,5,6};
        assert solution.searchInsert(nums, 5) == 2;
    }
    
    @Test
    public void example2() {
        int[] nums = {1,3,5,6};
        assert solution.searchInsert(nums, 2) == 1;
    }
    
    @Test
    public void example3() {
        int[] nums = {1,3,5,6};
        assert solution.searchInsert(nums, 7) == 4;
    }
    
    @Test
    public void example4() {
        int[] nums = {1,3,5,6};
        assert solution.searchInsert(nums, 0) == 0;
    }
    
    @Test
    public void example5() {
        int[] nums = {1};
        assert solution.searchInsert(nums, 1) == 0;
    }
}
