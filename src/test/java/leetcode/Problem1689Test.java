package leetcode;

import org.junit.Test;

public class Problem1689Test {
    private final Problem1689 solution = new Problem1689();
    
    @Test
    public void example1() {
        assert solution.minPartitions("32") == 3;
    }
    
    @Test
    public void example2() {
        assert solution.minPartitions("82734") == 8;
    }
    
    @Test
    public void example3() {
        assert solution.minPartitions("27346209830709182346") == 9;
    }
}
