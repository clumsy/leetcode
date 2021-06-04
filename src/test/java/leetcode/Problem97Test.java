package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem97Test {
    private final Problem97 solution = new Problem97();
    
    @Test
    public void example1() {
        assertThat(solution.isInterleave("aabcc", "dbbca", "aadbbcbcac"), is(true));
    }
    
    @Test
    public void example2() {
        assertThat(solution.isInterleave("aabcc", "dbbca", "aadbbbaccc"), is(false));
    }
    
    @Test
    public void example3() {
        assertThat(solution.isInterleave("", "", ""), is(true));
    }
    
    @Test
    public void example4() {
        assertThat(solution.isInterleave("", "", "a"), is(false));
    }
    
    @Test
    public void example5() {
        assertThat(solution.isInterleave("a", "", "c"), is(false));
    }
}
