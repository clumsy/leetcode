package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem44Test {
    private final Problem44 solution = new Problem44();
    
    @Test
    public void example1() {
        assertThat(solution.isMatch("aa", "a"), is(false));
    }
    
    @Test
    public void example2() {
        assertThat(solution.isMatch("aa", "*"), is(true));
    }
    
    @Test
    public void example3() {
        assertThat(solution.isMatch("cb", "?a"), is(false));
    }
    
    @Test
    public void example4() {
        assertThat(solution.isMatch("adceb", "*a*b"), is(true));
    }
    
    @Test
    public void example5() {
        assertThat(solution.isMatch("acdcb", "a*c?b"), is(false));
    }
}
