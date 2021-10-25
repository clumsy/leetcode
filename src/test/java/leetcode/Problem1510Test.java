package leetcode;

import org.junit.Test;

public class Problem1510Test {
    private final Problem1510 solution = new Problem1510();
    
    @Test
    public void example1() {
        assert solution.winnerSquareGame(1);
    }
    
    @Test
    public void example2() {
        assert !solution.winnerSquareGame(2);
    }
    
    @Test
    public void example3() {
        assert solution.winnerSquareGame(4);
    }
    
    @Test
    public void example4() {
        assert !solution.winnerSquareGame(7);
    }
    
    @Test
    public void example5() {
        assert !solution.winnerSquareGame(17);
    }
}
