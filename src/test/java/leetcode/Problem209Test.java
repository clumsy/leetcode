package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem209Test {
    private final Problem209 solution = new Problem209();
    
    @Test
    public void example1() {
        assertThat(solution.minSubArrayLen(7, new int[] {2,3,1,2,4,3}), is(2));
    }
    
    @Test
    public void example2() {
        assertThat(solution.minSubArrayLen(4, new int[] {1,4,4}), is(1));
    }
    
    @Test
    public void example11() {
        assertThat(solution.minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1}), is(0));
    }
}
