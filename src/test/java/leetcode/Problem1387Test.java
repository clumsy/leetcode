package leetcode;

import org.junit.Test;

public class Problem1387Test {
    private final Problem1387 solution = new Problem1387();
    
    @Test
    public void example1() {
        assert solution.getKth(12, 15, 2) == 13;
    }
    
    @Test
    public void example2() {
        assert solution.getKth(7, 11, 4) == 7;
    }
}
