package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem213Test {
    private final Problem213 solution = new Problem213();
    
    @Test
    public void example1() {
        int[] nums = {2,3,2};
        assertThat(solution.rob(nums), is(3));
    }
    
    @Test
    public void example2() {
        int[] nums = {1,2,3,1};
        assertThat(solution.rob(nums), is(4));
    }
    
    @Test
    public void example3() {
        int[] nums = {1,2,3};
        assertThat(solution.rob(nums), is(3));
    }
    
    @Test
    public void example4() {
        int[] nums = {3};
        assertThat(solution.rob(nums), is(3));
    }
    
    @Test
    public void example5() {
        int[] nums = {1,3,1,3,100};
        assertThat(solution.rob(nums), is(103));
    }
}
