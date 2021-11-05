package leetcode;

import org.junit.Test;

public class Problem198Test {
    private final Problem198 solution = new Problem198();
    
    @Test
    public void example1() {
        int[] nums = {1,2,3,1};
        assert solution.rob(nums) == 4;
    }
    
    @Test
    public void example2() {
        int[] nums = {2,7,9,3,1};
        assert solution.rob(nums) == 12;
    }
}
