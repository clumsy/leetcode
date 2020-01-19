package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem22Test {
    private Problem22 solution = new Problem22();

    @Test
    public void generateThree() {
        assertThat(solution.generateParenthesis(3), is(
            asList(
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()")));
    }
}
