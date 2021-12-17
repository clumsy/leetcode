package leetcode;

import org.junit.Test;

public class Problem1221Test {
    private final Problem1221 solution = new Problem1221();
    
    @Test
    public void example1() {
        assert solution.balancedStringSplit("RLRRLLRLRL") == 4;
    }
    
    @Test
    public void example2() {
        assert solution.balancedStringSplit("RLLLLRRRLR") == 3;
    }
    
    @Test
    public void example3() {
        assert solution.balancedStringSplit("LLLLRRRR") == 1;
    }
    
    @Test
    public void example4() {
        assert solution.balancedStringSplit("RLRRRLLRLL") == 2;
    }
}
