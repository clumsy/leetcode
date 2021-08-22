package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1021Test {
    private final Problem1021 solution = new Problem1021();
    
    @Test
    public void example1() {
        assertThat(solution.removeOuterParentheses("(()())(())"), is("()()()"));
    }
    
    @Test
    public void example2() {
        assertThat(solution.removeOuterParentheses("(()())(())(()(()))"), is("()()()()(())"));
    }
    
    @Test
    public void example3() {
        assertThat(solution.removeOuterParentheses("()()"), is(""));
    }
}
