package leetcode;

import org.junit.Test;

public class Problem290Test {
    private final Problem290 solution = new Problem290();
    
    @Test
    public void example1() {
        assert solution.wordPattern("abba", "dog cat cat dog");
    }
    
    @Test
    public void example2() {
        assert !solution.wordPattern("abba", "dog cat cat fish");
    }
    
    @Test
    public void example3() {
        assert !solution.wordPattern("aaaa", "dog cat cat dog");
    }
    
    @Test
    public void example4() {
        assert !solution.wordPattern("abba", "dog dog dog dog");
    }
}
