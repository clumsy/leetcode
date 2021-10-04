package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem494Test {
    private final Problem494 solution = new Problem494();
    
    @Test
    public void example1() {
        int[] nums = {1,1,1,1,1};
        assertThat(solution.findTargetSumWays(nums, 3), is(5));
    }
    
    @Test
    public void example2() {
        int[] nums = {1};
        assertThat(solution.findTargetSumWays(nums, 1), is(1));
    }
    
    @Test
    public void example3() {
        int[] nums = {0,0,0,0,0,0,0,0,1};
        assertThat(solution.findTargetSumWays(nums, 1), is(256));
    }
}
