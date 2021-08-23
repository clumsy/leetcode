package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1218Test {
    private final Problem1218 solution = new Problem1218();
    
    @Test
    public void example1() {
        int[] arr = {1,2,3,4};
        assertThat(solution.longestSubsequence(arr, 1), is(4));
    }
    
    @Test
    public void example2() {
        int[] arr = {1,3,5,7};
        assertThat(solution.longestSubsequence(arr, 1), is(1));
    }
    
    @Test
    public void example3() {
        int[] arr = {1,5,7,8,5,3,4,2,1};
        assertThat(solution.longestSubsequence(arr, -2), is(4));
    }
}
