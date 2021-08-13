package leetcode;

import org.junit.Test;

import static leetcode.Asserts.within;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem837Test {
    private static final double EPSILON = 10e-5;
    private final Problem837 solution = new Problem837();
    
    @Test
    public void example1() {
        assertThat(solution.new21Game(10, 1, 10), is(within(1.00000, EPSILON)));
    }
    
    @Test
    public void example2() {
        assertThat(solution.new21Game(6, 1, 10), is(within(0.60000, EPSILON)));
    }
    
    @Test
    public void example3() {
        assertThat(solution.new21Game(21, 17, 10), is(within(0.73278, EPSILON)));
    }
}
