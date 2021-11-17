package leetcode;

import org.junit.Test;

public class Problem397Test {
    private final Problem397 solution = new Problem397();
    
    @Test
    public void example1() {
        assert solution.integerReplacement(8) == 3;
    }
    
    @Test
    public void example2() {
        assert solution.integerReplacement(7) == 4;
    }
    
    @Test
    public void example3() {
        assert solution.integerReplacement(4) == 2;
    }
    
    @Test
    public void example4() {
        assert solution.integerReplacement(3) == 2;
    }
    
    @Test
    public void example5() {
        assert solution.integerReplacement(Integer.MAX_VALUE) == 32;
    }
    
    @Test
    public void example6() {
        assert solution.integerReplacement(100000000) == 31;
    }
}
