package leetcode;

import org.junit.Test;

public class Problem1137Test {
    private final Problem1137 solution = new Problem1137();
    
    @Test
    public void example1() {
        assert solution.tribonacci(4) == 4;
    }
    
    @Test
    public void example2() {
        assert solution.tribonacci(25) == 1389537;
    }
    
    @Test
    public void example3() {
        assert solution.tribonacci(30) == 1389537;
    }
}
