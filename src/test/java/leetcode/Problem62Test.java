package leetcode;

import org.junit.Test;

public class Problem62Test {
    private final Problem62 solution = new Problem62();
    
    @Test
    public void example1() {
        assert solution.uniquePaths(3, 7) == 28;
    }
    
    @Test
    public void example2() {
        assert solution.uniquePaths(3, 2) == 3;
    }
    
    @Test
    public void example3() {
        assert solution.uniquePaths(7, 3) == 28;
    }
    
    @Test
    public void example4() {
        assert solution.uniquePaths(3, 3) == 6;
    }
}
