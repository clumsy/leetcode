package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1508Test {
    private final Problem1508 solution = new Problem1508();
    
    @Test
    public void example1() {
        int[] nums = {1,2,3,4};
        assertThat(solution.rangeSum(nums, 4, 1, 5), is(13));
    }
    
    @Test
    public void example2() {
        int[] nums = {1,2,3,4};
        assertThat(solution.rangeSum(nums, 4, 3, 4), is(6));
    }
    
    @Test
    public void example3() {
        int[] nums = {1,2,3,4};
        assertThat(solution.rangeSum(nums, 4, 1, 10), is(50));
    }
}
