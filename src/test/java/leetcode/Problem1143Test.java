package leetcode;

import org.junit.Test;

public class Problem1143Test {
    private final Problem1143 solution = new Problem1143();
    
    @Test
    public void example1() {
        assert solution.longestCommonSubsequence("abcde", "ace") == 3;
    }
    
    @Test
    public void example2() {
        assert solution.longestCommonSubsequence("abc", "abc") == 3;
    }
    
    @Test
    public void example3() {
        assert solution.longestCommonSubsequence("abc", "def") == 0;
    }
    
    @Test
    public void example4() {
        assert solution.longestCommonSubsequence("bsbininm", "jmjkbkjkv") == 1;
    }
}
