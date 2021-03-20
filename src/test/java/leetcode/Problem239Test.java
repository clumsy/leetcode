package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem239Test {
    private final Problem239 solution = new Problem239();
    
    @Test
    public void example1() {
        assertThat(solution.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3), is(new int[] {3,3,5,5,6,7}));
    }
    
    @Test
    public void example2() {
        assertThat(solution.maxSlidingWindow(new int[] {7,2,4}, 2), is(new int[] {7,4}));
    }
    
    @Test
    public void example3() {
        assertThat(solution.maxSlidingWindow(new int[] {1,3,1,2,0,5}, 3), is(new int[] {3,3,2,5}));
    }
}
