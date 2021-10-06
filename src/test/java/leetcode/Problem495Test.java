package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem495Test {
    private final Problem495 solution = new Problem495();
    
    @Test
    public void example1() {
        int[] timeSeries = {1,4};
        assertThat(solution.findPoisonedDuration(timeSeries, 2), is(4));
    }
    
    @Test
    public void example2() {
        int[] timeSeries = {1,2};
        assertThat(solution.findPoisonedDuration(timeSeries, 2), is(3));
    }
    
    @Test
    public void example3() {
        int[] timeSeries = {1,2,3,4,5,6,7,8,9};
        assertThat(solution.findPoisonedDuration(timeSeries, 1), is(9));
    }
}
