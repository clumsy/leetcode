package leetcode;

import org.junit.Test;

public class Problem20Test {
    private final Problem20 solution = new Problem20();

    @Test
    public void example1() {
        assert solution.isValid("()");
    }

    @Test
    public void example2() {
        assert solution.isValid("()[]{}");
    }

    @Test
    public void example3() {
        assert !solution.isValid("(]");
    }

    @Test
    public void example4() {
        assert !solution.isValid("([)]");
    }

    @Test
    public void example5() {
        assert solution.isValid("{[]}");
    }

    @Test
    public void example6() {
        assert !solution.isValid("]");
    }
}
