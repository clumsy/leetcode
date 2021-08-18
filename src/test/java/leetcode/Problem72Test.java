package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem72Test {
    private final Problem72 solution = new Problem72();
    
    @Test
    public void example1() {
        assertThat(solution.minDistance("horse", "ros"), is(3));
    }
    
    @Test
    public void example2() {
        assertThat(solution.minDistance("intention", "execution"), is(5));
    }
    
    @Test
    public void example3() {
        assertThat(solution.minDistance("a", "ab"), is(1));
    }
}
