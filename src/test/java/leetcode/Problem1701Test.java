package leetcode;

import org.junit.Test;

import static leetcode.Asserts.within;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1701Test {
    private static final double EPSILON = 10e-5;
    private final Problem1701 solution = new Problem1701();
    
    @Test
    public void example1() {
        int[][] customers = {{1,2},{2,5},{4,3}};
        assertThat(solution.averageWaitingTime(customers), is(within(5.0000, EPSILON)));
    }
    
    @Test
    public void example2() {
        int[][] customers = {{5,2},{5,4},{10,3},{20,1}};
        assertThat(solution.averageWaitingTime(customers), is(within(3.2500, EPSILON)));
    }
}
