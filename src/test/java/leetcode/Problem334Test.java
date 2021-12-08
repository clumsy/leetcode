package leetcode;

import org.junit.Test;

public class Problem334Test {
    private final Problem334 solution = new Problem334();
    
    @Test
    public void example1() {
        int[] nums = {1,2,3,4,5};
        assert solution.increasingTriplet(nums);
    }
    
    @Test
    public void example2() {
        int[] nums = {5,4,3,2,1};
        assert !solution.increasingTriplet(nums);
    }
    
    @Test
    public void example3() {
        int[] nums = {2,1,5,0,4,6};
        assert solution.increasingTriplet(nums);
    }
    
    @Test
    public void example4() {
        int[] nums = {2147483646,2147483647,2147483647};
        assert !solution.increasingTriplet(nums);
    }
}
