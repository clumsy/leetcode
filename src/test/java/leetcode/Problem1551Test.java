package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1551Test {
    private final Problem1551 solution = new Problem1551();
    
    @Test
    public void example1() {
        assertThat(solution.minOperations(3), is(2));
    }
    
    @Test
    public void example2() {
        assertThat(solution.minOperations(6), is(9));
    }
}
