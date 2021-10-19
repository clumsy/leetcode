package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem739Test {
    private final Problem739 solution = new Problem739();
    
    @Test
    public void example1() {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        assertThat(solution.dailyTemperatures(temperatures), is(new int[] {1,1,4,2,1,1,0,0}));
    }
    
    @Test
    public void example2() {
        int[] temperatures = {30,40,50,60};
        assertThat(solution.dailyTemperatures(temperatures), is(new int[] {1,1,1,0}));
    }
    
    @Test
    public void example3() {
        int[] temperatures = {30,60,90};
        assertThat(solution.dailyTemperatures(temperatures), is(new int[] {1,1,0}));
    }
}
