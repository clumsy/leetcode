package leetcode;

import org.junit.Test;

import static leetcode.Asserts.within;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem808Test {
    private static final double EPSILON = 10e-8;
    private final Problem808 solution = new Problem808();
    
    @Test
    public void example1() {
        assertThat(solution.soupServings(50), is(within(0.6250, EPSILON)));
    }
    
    @Test
    public void example2() {
        assertThat(solution.soupServings(1), is(within(0.6250, EPSILON)));
    }
    
    @Test
    public void example3() {
        assertThat(solution.soupServings(0), is(within(0.5000, EPSILON)));
    }
}
