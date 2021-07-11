package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem808Test {
    private final Problem808 solution = new Problem808();
    
    @Test
    public void example1() {
        assertThat(Math.abs(solution.soupServings(50) - 0.6250) < 0.00000001d, is(true));
    }
    
    @Test
    public void example2() {
        assertThat(Math.abs(solution.soupServings(1) - 0.62500) < 0.00000001d, is(true));
    }
    
    @Test
    public void example3() {
        assertThat(Math.abs(solution.soupServings(0) - 0.5) < 0.00000001d, is(true));
    }
}
