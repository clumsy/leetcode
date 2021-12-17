package leetcode;

import org.junit.Test;

public class Problem1342Test {
    private final Problem1342 solution = new Problem1342();
    
    @Test
    public void example1() {
        assert solution.numberOfSteps(14) == 6;
    }
    
    @Test
    public void example2() {
        assert solution.numberOfSteps(8) == 4;
    }
    
    @Test
    public void example3() {
        assert solution.numberOfSteps(123) == 12;
    }
    
    @Test
    public void example4() {
        assert solution.numberOfSteps(0) == 0;
    }
}
