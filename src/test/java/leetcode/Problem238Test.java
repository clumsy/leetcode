package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem238Test {
    private final Problem238 solution = new Problem238();
    
    @Test
    public void example1() {
        int[] nums = {1,2,3,4};
        assert Arrays.equals(solution.productExceptSelf(nums), new int[] {24,12,8,6});
    }
    
    @Test
    public void example2() {
        int[] nums = {-1,1,0,-3,3};
        assert Arrays.equals(solution.productExceptSelf(nums), new int[] {0,0,9,0,0});
    }
}
