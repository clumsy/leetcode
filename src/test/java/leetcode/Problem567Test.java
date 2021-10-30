package leetcode;

import org.junit.Test;

public class Problem567Test {
    private final Problem567 solution = new Problem567();
    
    @Test
    public void example1() {
        assert solution.checkInclusion("ab", "eidbaooo");
    }
    
    @Test
    public void example2() {
        assert !solution.checkInclusion("ab", "eidboaoo");
    }
    
    @Test
    public void example3() {
        assert solution.checkInclusion("abcdxabcde", "abcdeabcdx");
    }
}
