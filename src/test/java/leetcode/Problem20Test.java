package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem20Test {
    private Problem20 solution = new Problem20();

    @Test
    public void singleParenthesis() {
        assertThat(solution.isValid("()"), is(true));
    }

    @Test
    public void threeTypes() {
        assertThat(solution.isValid("()[]{}"), is(true));
    }

    @Test
    public void wrongClosing() {
        assertThat(solution.isValid("(]"), is(false));
    }

    @Test
    public void wrongMixture() {
        assertThat(solution.isValid("([)]"), is(false));
    }

    @Test
    public void validMixture() {
        assertThat(solution.isValid("{[]}"), is(true));
    }
}
