package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem75Test {
    private final Problem75 solution = new Problem75();
    
    @Test
    public void example1() {
        int[] nums = {2,0,2,1,1,0};
        solution.sortColors(nums);
        assert Arrays.equals(nums, new int[] {0,0,1,1,2,2});
    }
    
    @Test
    public void example2() {
        int[] nums = {2,0,1};
        solution.sortColors(nums);
        assert Arrays.equals(nums, new int[] {0,1,2});
    }
}
