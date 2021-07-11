package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1716Test {
    private final Problem1716 solution = new Problem1716();
    
    @Test
    public void example1() {
        assertThat(solution.totalMoney(4), is(10));
    }
    
    @Test
    public void example2() {
        assertThat(solution.totalMoney(10), is(37));
    }
    
    @Test
    public void example3() {
        assertThat(solution.totalMoney(20), is(96));
    }
}
