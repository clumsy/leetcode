package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem1920Test {
    private final Problem1920 solution = new Problem1920();
    
    @Test
    public void example1() {
        int[] nums = {0,2,1,5,3,4};
        assert Arrays.equals(solution.buildArray(nums), new int[] {0,1,2,4,5,3});
    }
    
    @Test
    public void example2() {
        int[] nums = {5,0,1,2,3,4};
        assert Arrays.equals(solution.buildArray(nums), new int[] {4,5,0,1,2,3});
    }
}
