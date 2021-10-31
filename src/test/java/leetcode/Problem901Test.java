package leetcode;

import leetcode.Problem901.StockSpanner;
import org.junit.Test;

public class Problem901Test {
    private final Problem901 solution = new Problem901();
    
    @Test
    public void example1() {
        StockSpanner stockPlanner = solution.new StockSpanner();
        assert stockPlanner.next(100) == 1;
        assert stockPlanner.next(80) == 1;
        assert stockPlanner.next(60) == 1;
        assert stockPlanner.next(70) == 2;
        assert stockPlanner.next(60) == 1;
        assert stockPlanner.next(75) == 4;
        assert stockPlanner.next(85) == 6;
    }
}
