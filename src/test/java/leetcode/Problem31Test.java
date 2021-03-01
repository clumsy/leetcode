package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem31Test {
    private final Problem31 solution = new Problem31();

    @Test
    public void example1() {
        int[] nums = {1, 2, 3};
        solution.nextPermutation(nums);
        assertThat(nums, is(new int[] {1,3,2}));
    }

    @Test
    public void example2() {
        int[] nums = {3,2,1};
        solution.nextPermutation(nums);
        assertThat(nums, is(new int[] {1,2,3}));
    }

    @Test
    public void example3() {
        int[] nums = {1,1,5};
        solution.nextPermutation(nums);
        assertThat(nums, is(new int[] {1,5,1}));
    }
}
