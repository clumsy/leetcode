package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem10Test {
    private final Problem10 solution = new Problem10();
    
    @Test
    public void example1() {
        assertThat(solution.isMatch("aa", "a"), is(false));
    }
    
    @Test
    public void example2() {
        assertThat(solution.isMatch("aa", "a*"), is(true));
    }
    
    @Test
    public void example3() {
        assertThat(solution.isMatch("ab", ".*"), is(true));
    }
    
    @Test
    public void example4() {
        assertThat(solution.isMatch("aab", "c*a*b"), is(true));
    }
    
    @Test
    public void example5() {
        assertThat(solution.isMatch("mississippi", "mis*is*p*."), is(false));
    }
    
    @Test
    public void example6() {
        assertThat(solution.isMatch("aaa", "a*a"), is(true));
    }
    
    @Test
    public void example7() {
        assertThat(solution.isMatch("bbbba", ".*a*a"), is(true));
    }
}
