package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem1365Test {
    private final Problem1365 solution = new Problem1365();
    
    @Test
    public void example1() {
        int[] nums = {8,1,2,2,3};
        assert Arrays.equals(solution.smallerNumbersThanCurrent(nums), new int[] {4,0,1,1,3});
    }
    
    @Test
    public void example2() {
        int[] nums = {6,5,4,8};
        assert Arrays.equals(solution.smallerNumbersThanCurrent(nums), new int[] {2,1,0,3});
    }
    
    @Test
    public void example3() {
        int[] nums = {7,7,7,7};
        assert Arrays.equals(solution.smallerNumbersThanCurrent(nums), new int[] {0,0,0,0});
    }
}
