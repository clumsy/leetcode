package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem81Test {
    private final Problem81 solution = new Problem81();
    
    @Test
    public void example1() {
        int[] nums = {2,5,6,0,0,1,2};
        assertThat(solution.search(nums, 0), is(true));
    }
    
    @Test
    public void example2() {
        int[] nums = {2,5,6,0,0,1,2};
        assertThat(solution.search(nums, 3), is(false));
    }
    
    @Test
    public void example3() {
        int[] nums = {3,1};
        assertThat(solution.search(nums, 1), is(true));
    }
    
    @Test
    public void example4() {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        assertThat(solution.search(nums, 2), is(true));
    }
    
    @Test
    public void example5() {
        int[] nums = {1,0,1,1,1};
        assertThat(solution.search(nums, 0), is(true));
    }
    
    @Test
    public void example6() {
        int[] nums = {3,1,1};
        assertThat(solution.search(nums, 3), is(true));
    }
    
    @Test
    public void example7() {
        int[] nums = {1,3,5};
        assertThat(solution.search(nums, 1), is(true));
    }
    
    @Test
    public void example8() {
        int[] nums = {3,5,1};
        assertThat(solution.search(nums, 1), is(true));
    }
}
