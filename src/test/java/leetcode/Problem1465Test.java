package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1465Test {
    private final Problem1465 solution = new Problem1465();
    
    @Test
    public void example1() {
        assertThat(solution.maxArea(5, 4, new int[] {1,2,4}, new int[] {1,3}), is(4));
    }
    
    @Test
    public void example2() {
        assertThat(solution.maxArea(5, 4, new int[] {3,1}, new int[] {1}), is(6));
    }
    
    @Test
    public void example3() {
        assertThat(solution.maxArea(5, 4, new int[] {3}, new int[] {3}), is(9));
    }
}
