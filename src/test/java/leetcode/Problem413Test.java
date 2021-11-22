package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem413Test {
    private final Problem413 solution = new Problem413();

    @Test
    public void example1() {
        int[] nums = {1,2,3,4};
        assert solution.numberOfArithmeticSlices(nums) == 3;
    }

    @Test
    public void example2() {
        int[] nums = {1};
        assert solution.numberOfArithmeticSlices(nums) == 0;
    }

    @Test
    public void example3() {
        int[] nums = {1,2,3,8,9,10};
        assert solution.numberOfArithmeticSlices(nums) == 2;
    }

    @Test
    public void example4() {
        int[] nums = {2,1,3,4,2,3};
        assert solution.numberOfArithmeticSlices(nums) == 0;
    }

    @Test
    public void example5() {
        int[] nums = {1,2,3,8,9,10};
        assert solution.numberOfArithmeticSlices(nums) == 2;
    }
}
