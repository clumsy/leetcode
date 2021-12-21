package leetcode;

import org.junit.Test;

public class Problem1877Test {
    private final Problem1877 solution = new Problem1877();
    
    @Test
    public void example1() {
        int[] nums = {3,5,2,3};
        assert solution.minPairSum(nums) == 7;
    }
    
    @Test
    public void example2() {
        int[] nums = {3,5,4,2,4,6};
        assert solution.minPairSum(nums) == 8;
    }
}
