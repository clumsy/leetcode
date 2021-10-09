package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem503Test {
    private final Problem503 solution = new Problem503();
    
    @Test
    public void example1() {
        int[] nums = {1,2,1};
        assertThat(solution.nextGreaterElements(nums), is(new int[] {2,-1,2}));
    }
    
    @Test
    public void example2() {
        int[] nums = {1,2,3,4,3};
        assertThat(solution.nextGreaterElements(nums), is(new int[] {2,3,4,-1,4}));
    }
    
    @Test
    public void example3() {
        int[] nums = {1,2,3,2,1};
        assertThat(solution.nextGreaterElements(nums), is(new int[] {2,3,-1,3,2}));
    }
    
    @Test
    public void example4() {
        int[] nums = {5,4,3,2,1};
        assertThat(solution.nextGreaterElements(nums), is(new int[] {-1,5,5,5,5}));
    }
}
