package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem22Test {
    private final Problem22 solution = new Problem22();

    @Test
    public void example1() {
        assert Objects.equals(solution.generateParenthesis(3),
            Arrays.asList(
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"));
    }

    @Test
    public void example2() {
        assert Objects.equals(solution.generateParenthesis(1),
            Arrays.asList(
                "()"));
    }
}
