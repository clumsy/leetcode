package leetcode;

import org.junit.Test;

public class Problem383Test {
    private final Problem383 solution = new Problem383();
    
    @Test
    public void example1() {
        assert !solution.canConstruct("a", "b");
    }
    
    @Test
    public void example2() {
        assert !solution.canConstruct("aa", "ab");
    }
    
    @Test
    public void example3() {
        assert solution.canConstruct("aa", "aab");
    }
}
