package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem34Test {
    private final Problem34 solution = new Problem34();

    @Test
    public void example1() {
        int[] nums = {5,7,7,8,8,10};
        assert Arrays.equals(solution.searchRange(nums, 8), new int[] {3,4});
    }

    @Test
    public void example2() {
        int[] nums = {};
        assert Arrays.equals(solution.searchRange(nums, 0), new int[] {-1,-1});
    }

    @Test
    public void example3() {
        int[] nums = {1};
        assert Arrays.equals(solution.searchRange(nums, 0), new int[] {-1,-1});
    }

    @Test
    public void example4() {
        int[] nums = {1};
        assert Arrays.equals(solution.searchRange(nums, 1), new int[] {0,0});
    }

    @Test
    public void example5() {
        int[] nums = {2,2};
        assert Arrays.equals(solution.searchRange(nums, 2), new int[] {0,1});
    }

    @Test
    public void example6() {
        int[] nums = {1,3};
        assert Arrays.equals(solution.searchRange(nums, 1), new int[] {0,0});
    }

    @Test
    public void example7() {
        int[] nums = {1,1,2};
        assert Arrays.equals(solution.searchRange(nums, 1), new int[] {0,1});
    }

    @Test
    public void example8() {
        int[] nums = {3,3,3};
        assert Arrays.equals(solution.searchRange(nums, 3), new int[] {0,2});
    }
}
