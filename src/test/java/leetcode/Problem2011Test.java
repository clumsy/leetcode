package leetcode;

import org.junit.Test;

public class Problem2011Test {
    private final Problem2011 solution = new Problem2011();
    
    @Test
    public void example1() {
        String[] operations = {"--X","X++","X++"};
        assert solution.finalValueAfterOperations(operations) == 1;
    }
    
    @Test
    public void example2() {
        String[] operations = {"++X","++X","X++"};
        assert solution.finalValueAfterOperations(operations) == 3;
    }
    
    @Test
    public void example3() {
        String[] operations = {"X++","++X","--X","X--"};
        assert solution.finalValueAfterOperations(operations) == 0;
    }
}
