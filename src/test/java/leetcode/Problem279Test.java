package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem279Test {
    private final Problem279 solution = new Problem279();
    
    @Test
    public void example1() {
        assertThat(solution.numSquares(12), is(3));
    }
    
    @Test
    public void example2() {
        assertThat(solution.numSquares(13), is(2));
    }
}
