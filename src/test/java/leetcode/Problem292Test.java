package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem292Test {
    private final Problem292 solution = new Problem292();
    
    @Test
    public void example1() {
        assertThat(solution.canWinNim(4), is(false));
    }
    
    @Test
    public void example2() {
        assertThat(solution.canWinNim(1), is(true));
    }
    
    @Test
    public void example3() {
        assertThat(solution.canWinNim(2), is(true));
    }
    
    @Test
    public void example4() {
        assertThat(solution.canWinNim(8), is(false));
    }
    
    @Test
    public void example5() {
        assertThat(solution.canWinNim(1348820612), is(false));
    }
}
