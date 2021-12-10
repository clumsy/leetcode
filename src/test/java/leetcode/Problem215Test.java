package leetcode;

import org.junit.Test;

public class Problem215Test {
    private final Problem215 solution = new Problem215();

    @Test
    public void example1() {
        int[] nums = {3,2,1,5,6,4};
        assert solution.findKthLargest(nums, 2) == 5;
    }

    @Test
    public void example2() {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        assert solution.findKthLargest(nums, 4) == 4;
    }
}
