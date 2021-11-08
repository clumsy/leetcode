package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem1Test {
    private final Problem1 solution = new Problem1();

    @Test
    public void example1() {
        int[] nums = {2,7,11,15};
        assert Arrays.equals(solution.twoSum(nums, 9), new int[] {0,1});
    }

    @Test
    public void example2() {
        int[] nums = {3,2,4};
        assert Arrays.equals(solution.twoSum(nums, 6), new int[] {1,2});
    }

    @Test
    public void example3() {
        int[] nums = {3,3};
        assert Arrays.equals(solution.twoSum(nums, 6), new int[] {0,1});
    }
}
