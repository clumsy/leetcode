package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem204Test {
    private final Problem204 solution = new Problem204();
    
    @Test
    public void example1() {
        assertThat(solution.countPrimes(10), is(4));
    }
    
    @Test
    public void example2() {
        assertThat(solution.countPrimes(0), is(0));
    }
    
    @Test
    public void example3() {
        assertThat(solution.countPrimes(1), is(0));
    }
    
    @Test
    public void example4() {
        assertThat(solution.countPrimes(3), is(1));
    }
    
    @Test
    public void example5() {
        assertThat(solution.countPrimes(4), is(2));
    }
}
