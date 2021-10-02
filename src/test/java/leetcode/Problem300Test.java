package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem300Test {
    private final Problem300 solution = new Problem300();
    
    @Test
    public void example1() {
        int[] nums = {10,9,2,5,3,7,101,18};
        assertThat(solution.lengthOfLIS(nums), is(4));
    }
    
    @Test
    public void example2() {
        int[] nums = {0,1,0,3,2,3};
        assertThat(solution.lengthOfLIS(nums), is(4));
    }
    
    @Test
    public void example3() {
        int[] nums = {7,7,7,7,7,7,7};
        assertThat(solution.lengthOfLIS(nums), is(1));
    }
}
