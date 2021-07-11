package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1025Test {
    private final Problem1025 solution = new Problem1025();
    
    @Test
    public void example1() {
        assertThat(solution.divisorGame(2), is(true));
    }
    
    @Test
    public void example2() {
        assertThat(solution.divisorGame(3), is(false));
    }
    
    @Test
    public void example3() {
        assertThat(solution.divisorGame(100), is(true));
    }
}
