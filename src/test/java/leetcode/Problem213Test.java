package leetcode;

import org.junit.Test;

public class Problem213Test {
    private final Problem213 solution = new Problem213();
    
    @Test
    public void example1() {
        int[] nums = {2,3,2};
        assert solution.rob(nums) == 3;
    }
    
    @Test
    public void example2() {
        int[] nums = {1,2,3,1};
        assert solution.rob(nums) == 4;
    }
    
    @Test
    public void example3() {
        int[] nums = {1,2,3};
        assert solution.rob(nums) == 3;
    }
    
    @Test
    public void example4() {
        int[] nums = {3};
        assert solution.rob(nums) == 3;
    }
    
    @Test
    public void example5() {
        int[] nums = {1,3,1,3,100};
        assert solution.rob(nums) == 103;
    }
}
