package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem594Test {
    private final Problem594 solution = new Problem594();
    
    @Test
    public void example1() {
        int[] nums = {1,3,2,2,5,2,3,7};
        assertThat(solution.findLHS(nums), is(5));
    }
    
    @Test
    public void example2() {
        int[] nums = {1,2,3,4};
        assertThat(solution.findLHS(nums), is(2));
    }
    
    @Test
    public void example3() {
        int[] nums = {1,1,1,1};
        assertThat(solution.findLHS(nums), is(0));
    }
    
    @Test
    public void example4() {
        int[] nums = {1,2,1,3,0,0,2,2,1,3,3};
        assertThat(solution.findLHS(nums), is(6));
    }
}
