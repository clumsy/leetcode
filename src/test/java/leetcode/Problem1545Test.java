package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1545Test {
    private final Problem1545 solution = new Problem1545();
    
    @Test
    public void example1() {
        assertThat(solution.findKthBit(3, 1), is('0'));
    }
    
    @Test
    public void example2() {
        assertThat(solution.findKthBit(4, 11), is('1'));
    }
    
    @Test
    public void example3() {
        assertThat(solution.findKthBit(1, 1), is('0'));
    }
    
    @Test
    public void example4() {
        assertThat(solution.findKthBit(2, 3), is('1'));
    }
}
