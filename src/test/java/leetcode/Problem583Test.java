package leetcode;

import org.junit.Test;

public class Problem583Test {
    private final Problem583 solution = new Problem583();
    
    @Test
    public void example1() {
        assert solution.minDistance("sea", "eat") == 2;
    }
    
    @Test
    public void example2() {
        assert solution.minDistance("leetcode", "etco") == 4;
    }
    
    @Test
    public void example3() {
        assert solution.minDistance("a", "b") == 2;
    }
}
