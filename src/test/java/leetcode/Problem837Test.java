package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem837Test {
    private final Problem837 solution = new Problem837();
    
    @Test
    public void example1() {
        assertThat(Math.abs(solution.new21Game(10, 1, 10) - 1.00000) < 0.00001d, is(true));
    }
    
    @Test
    public void example2() {
        assertThat(Math.abs(solution.new21Game(6, 1, 10) - 0.60000) < 0.00001d, is(true));
    }
    
    @Test
    public void example3() {
        assertThat(Math.abs(solution.new21Game(21, 17, 10) - 0.73278) < 0.00001d, is(true));
    }
}
