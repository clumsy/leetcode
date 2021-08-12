package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1680Test {
    private final Problem1680 solution = new Problem1680();
    
    @Test
    public void example1() {
        assertThat(solution.concatenatedBinary(1), is(1));
    }
    
    @Test
    public void example2() {
        assertThat(solution.concatenatedBinary(3), is(27));
    }
    
    @Test
    public void example3() {
        assertThat(solution.concatenatedBinary(12), is(505379714));
    }
}
