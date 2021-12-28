package leetcode;

import org.junit.Test;

public class Problem921Test {
    private final Problem921 solution = new Problem921();
    
    @Test
    public void example1() {
        assert solution.minAddToMakeValid("(()") == 1;
    }
    
    @Test
    public void example2() {
        assert solution.minAddToMakeValid("(((") == 3;
    }
    
    @Test
    public void example3() {
        assert solution.minAddToMakeValid("()))((") == 4;
    }
}
