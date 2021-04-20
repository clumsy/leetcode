package leetcode;

import org.junit.Test;

public class Problem779Test {
    private final Problem779 solution = new Problem779();
    
    @Test
    public void example1() {
        assert solution.kthGrammar(1, 1) == 0;
    }
    
    @Test
    public void example2() {
        assert solution.kthGrammar(2, 1) == 0;
    }
    
    @Test
    public void example3() {
        assert solution.kthGrammar(2, 2) == 1;
    }
    
    @Test
    public void example4() {
        assert solution.kthGrammar(4, 5) == 1;
    }
}
