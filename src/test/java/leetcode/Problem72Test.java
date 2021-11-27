package leetcode;

import org.junit.Test;

public class Problem72Test {
    private final Problem72 solution = new Problem72();
    
    @Test
    public void example1() {
        assert solution.minDistance("horse", "ros") == 3;
    }
    
    @Test
    public void example2() {
        assert solution.minDistance("intention", "execution") == 5;
    }
    
    @Test
    public void example3() {
        assert solution.minDistance("a", "ab") == 1;
    }
}
