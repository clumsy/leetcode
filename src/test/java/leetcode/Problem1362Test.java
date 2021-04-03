package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1362Test {
    private final Problem1362 solution = new Problem1362();
    
    @Test
    public void example1() {
        assertThat(solution.closestDivisors(8), is(new int[] {3,3}));
    }
    
    @Test
    public void example2() {
        assertThat(solution.closestDivisors(123), is(new int[] {5,25}));
    }
    
    @Test
    public void example3() {
        assertThat(solution.closestDivisors(999), is(new int[] {25,40}));
    }
}
