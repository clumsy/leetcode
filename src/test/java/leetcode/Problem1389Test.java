package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem1389Test {
    private final Problem1389 solution = new Problem1389();
    
    @Test
    public void example1() {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        assert Arrays.equals(solution.createTargetArray(nums, index),
            new int[] {0,4,1,3,2});
    }
    
    @Test
    public void example2() {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        assert Arrays.equals(solution.createTargetArray(nums, index),
            new int[] {0,1,2,3,4});
    }
    
    @Test
    public void example3() {
        int[] nums = {1};
        int[] index = {0};
        assert Arrays.equals(solution.createTargetArray(nums, index),
            new int[] {1});
    }
}
