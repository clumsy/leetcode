package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1647Test {
    private final Problem1647 solution = new Problem1647();
    
    @Test
    public void example1() {
        assertThat(solution.minDeletions("aab"), is(0));
    }
    
    @Test
    public void example2() {
        assertThat(solution.minDeletions("aaabbbcc"), is(2));
    }
    
    @Test
    public void example3() {
        assertThat(solution.minDeletions("ceabaacb"), is(2));
    }
}
