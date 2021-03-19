package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1529Test {
    private final Problem1529 solution = new Problem1529();
    
    @Test
    public void example1() {
        assertThat(solution.minFlips("10111"), is(3));
    }
}
