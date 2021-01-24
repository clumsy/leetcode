package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem32Test {
    private final Problem32 solution = new Problem32();

    @Test
    public void example1() {
        assertThat(solution.longestValidParentheses("(()"), is(2));
    }

    @Test
    public void example2() {
        assertThat(solution.longestValidParentheses(")()())"), is(4));
    }

    @Test
    public void example3() {
        assertThat(solution.longestValidParentheses("()(()"), is(2));
    }

    @Test
    public void example4() {
        assertThat(solution.longestValidParentheses(")()())"), is(4));
    }
}
