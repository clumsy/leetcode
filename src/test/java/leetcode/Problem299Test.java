package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem299Test {
    private final Problem299 solution = new Problem299();
    
    @Test
    public void example1() {
        assertThat(solution.getHint("1807", "7810"), is("1A3B"));
    }
    
    @Test
    public void example2() {
        assertThat(solution.getHint("1123", "0111"), is("1A1B"));
    }
    
    @Test
    public void example3() {
        assertThat(solution.getHint("1", "0"), is("0A0B"));
    }
    
    @Test
    public void example4() {
        assertThat(solution.getHint("1", "1"), is("1A0B"));
    }
}
