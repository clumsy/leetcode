package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1247Test {
    private final Problem1247 solution = new Problem1247();
    
    @Test
    public void example1() {
        assertThat(solution.minimumSwap("xx", "yy"), is(1));
    }
    
    @Test
    public void example2() {
        assertThat(solution.minimumSwap("xy", "yx"), is(2));
    }
    
    @Test
    public void example3() {
        assertThat(solution.minimumSwap("xx", "xy"), is(-1));
    }
}
