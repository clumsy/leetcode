package leetcode;

import org.junit.Test;

public class Problem55Test {
    private final Problem55 solution = new Problem55();

    @Test
    public void example1() {
        int[] nums = {2, 3, 1, 1, 4};
        assert solution.canJump(nums);
    }

    @Test
    public void example3() {
        int[] nums = {3, 2, 1, 0, 4};
        assert !solution.canJump(nums);
    }
}
