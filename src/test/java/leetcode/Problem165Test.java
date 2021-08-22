package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem165Test {
    private final Problem165 solution = new Problem165();
    
    @Test
    public void example1() {
        assertThat(solution.compareVersion("1.01", "1.001"), is(0));
    }
    
    @Test
    public void example2() {
        assertThat(solution.compareVersion("1.0", "1.0.0"), is(0));
    }
    
    @Test
    public void example3() {
        assertThat(solution.compareVersion("0.1", "1.1"), is(-1));
    }
    
    @Test
    public void example4() {
        assertThat(solution.compareVersion("1.0.1", "1"), is(1));
    }
    
    @Test
    public void example5() {
        assertThat(solution.compareVersion("7.5.2.4", "7.5.3"), is(-1));
    }
}
