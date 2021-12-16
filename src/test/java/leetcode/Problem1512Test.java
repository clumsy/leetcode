package leetcode;

import org.junit.Test;

public class Problem1512Test {
    private final Problem1512 solution = new Problem1512();
    
    @Test
    public void example1() {
        int[] nums = {1,2,3,1,1,3};
        assert solution.numIdenticalPairs(nums) == 4;
    }
    
    @Test
    public void example2() {
        int[] nums = {1,1,1,1};
        assert solution.numIdenticalPairs(nums) == 6;
    }
    
    @Test
    public void example3() {
        int[] nums = {1,2,3};
        assert solution.numIdenticalPairs(nums) == 0;
    }
}
