package leetcode;

import org.junit.Test;

public class Problem1641Test {
    private final Problem1641 solution = new Problem1641();
    
    @Test
    public void example1() {
        assert solution.countVowelStrings(1) == 5;
    }
    
    @Test
    public void example2() {
        assert solution.countVowelStrings(2) == 15;
    }
    
    @Test
    public void example3() {
        assert solution.countVowelStrings(33) == 66045;
    }
}
