package leetcode;

import org.junit.Test;

public class Problem3Test {
    private final Problem3 solution = new Problem3();

    @Test
    public void example1() {
        assert solution.lengthOfLongestSubstring("abcabcbb") == 3;
    }

    @Test
    public void example2() {
        assert solution.lengthOfLongestSubstring("bbbbb") == 1;
    }

    @Test
    public void example3() {
        assert solution.lengthOfLongestSubstring("pwwkew") == 3;
    }

    @Test
    public void example4() {
        assert solution.lengthOfLongestSubstring(" ") == 1;
    }

    @Test
    public void example5() {
        assert solution.lengthOfLongestSubstring("aab") == 2;
    }

    @Test
    public void example6() {
        assert solution.lengthOfLongestSubstring("abba") == 2;
    }
}
