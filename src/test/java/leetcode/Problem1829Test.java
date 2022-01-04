package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem1829Test {
    private final Problem1829 solution = new Problem1829();
    
    @Test
    public void example1() {
        int[] nums = {0,1,1,3};
        assert Arrays.equals(solution.getMaximumXor(nums, 2),
            new int[] {0,3,2,3});
    }
    
    @Test
    public void example2() {
        int[] nums = {2,3,4,7};
        assert Arrays.equals(solution.getMaximumXor(nums, 3),
            new int[] {5,2,6,5});
    }
    
    @Test
    public void example3() {
        int[] nums = {0,1,2,2,5,7};
        assert Arrays.equals(solution.getMaximumXor(nums, 3),
            new int[] {4,3,6,4,6,7});
    }
}
