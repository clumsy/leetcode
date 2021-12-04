package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem1249Test {
    private final Problem1249 solution = new Problem1249();
    
    @Test
    public void example1() {
        assert Objects.equals(solution.minRemoveToMakeValid("lee(t(c)o)de)"), "lee(t(c)o)de");
    }
    
    @Test
    public void example2() {
        assert Objects.equals(solution.minRemoveToMakeValid("a)b(c)d"), "ab(c)d");
    }
    
    @Test
    public void example3() {
        assert Objects.equals(solution.minRemoveToMakeValid("))(("), "");
    }
    
    @Test
    public void example4() {
        assert Objects.equals(solution.minRemoveToMakeValid("(a(b(c)d)"), "a(b(c)d)");
    }
}
