package leetcode;

import org.junit.Test;

public class Problem162Test {
    private final Problem162 solution = new Problem162();

    @Test
    public void example1() {
        int[] nums = {1, 2, 3, 1};
        assert solution.findPeakElement(nums) == 2;
    }

    @Test
    public void example2() {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        assert solution.findPeakElement(nums) == 5;
    }
}
