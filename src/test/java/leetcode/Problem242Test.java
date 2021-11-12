package leetcode;

import org.junit.Test;

public class Problem242Test {
    private final Problem242 solution = new Problem242();
    
    @Test
    public void example1() {
        assert solution.isAnagram("anagram", "nagaram");
    }
    
    @Test
    public void example2() {
        assert !solution.isAnagram("rat", "car");
    }
}
