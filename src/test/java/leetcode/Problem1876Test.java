package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1876Test {
    private final Problem1876 solution = new Problem1876();
    
    @Test
    public void example1() {
        assertThat(solution.countGoodSubstrings("xyzzaz"), is(1));
    }
    
    @Test
    public void example2() {
        assertThat(solution.countGoodSubstrings("aababcabc"), is(4));
    }
}
