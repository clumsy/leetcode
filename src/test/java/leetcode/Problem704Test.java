package leetcode;

import org.junit.Test;

public class Problem704Test {
    private final Problem704 solution = new Problem704();
    
    @Test
    public void example1() {
        int[] nums = {-1,0,3,5,9,12};
        assert solution.search(nums, 9) == 4;
    }
    
    @Test
    public void example2() {
        int[] nums = {-1,0,3,5,9,12};
        assert solution.search(nums, 2) == -1;
    }
    
    @Test
    public void example3() {
        int[] nums = {-1,0,3,5,9,12};
        assert solution.search(nums, 2) == -1;
    }
    
    @Test
    public void example4() {
        int[] nums = {5};
        assert solution.search(nums, 5) == 0;
    }
}
