package leetcode;

import org.junit.Test;

public class Problem1281Test {
    private final Problem1281 solution = new Problem1281();
    
    @Test
    public void example1() {
        assert solution.subtractProductAndSum(234) == 15;
    }
    
    @Test
    public void example2() {
        assert solution.subtractProductAndSum(4421) == 21;
    }
}
