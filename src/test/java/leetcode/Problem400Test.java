package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem400Test {
    private final Problem400 solution = new Problem400();
    
    @Test
    public void example1() {
        assertThat(solution.findNthDigit(3), is(3));
    }
    
    @Test
    public void example2() {
        assertThat(solution.findNthDigit(11), is(0));
    }
    
    @Test
    public void example3() {
        assertThat(solution.findNthDigit(1000), is(3));
    }
    
    @Test
    public void example4() {
        assertThat(solution.findNthDigit(10000), is(7));
    }
    
    @Test
    public void example5() {
        assertThat(solution.findNthDigit(10), is(1));
    }
    
    @Test
    public void example6() {
        assertThat(solution.findNthDigit(14), is(1));
    }
    
    @Test
    public void example7() {
        assertThat(solution.findNthDigit(1000000000), is(1));
    }
}
