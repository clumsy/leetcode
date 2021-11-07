package leetcode;

import org.junit.Test;

public class Problem217Test {
    private final Problem217 solution = new Problem217();

    @Test
    public void example1() {
        int[] nums = {1,2,3,1};
        assert solution.containsDuplicate(nums);
    }

    @Test
    public void example2() {
        int[] nums = {1,2,3,4};
        assert !solution.containsDuplicate(nums);
    }

    @Test
    public void example3() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        assert solution.containsDuplicate(nums);
    }
}
