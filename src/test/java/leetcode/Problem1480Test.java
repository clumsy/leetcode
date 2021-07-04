package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1480Test {
    private final Problem1480 solution = new Problem1480();
    
    @Test
    public void example1() {
        assertThat(solution.runningSum(new int[] {1,2,3,4}), is(new int[] {1,3,6,10}));
    }
}
