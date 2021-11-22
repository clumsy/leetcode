package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem5Test {
    private final Problem5 solution = new Problem5();

    @Test
    public void example1() {
        assert Objects.equals(solution.longestPalindrome("babad"), "bab");
    }

    @Test
    public void example2() {
        assert Objects.equals(solution.longestPalindrome("cbbd"), "bb");
    }

    @Test
    public void example3() {
        assert Objects.equals(solution.longestPalindrome("a"), "a");
    }

    @Test
    public void example4() {
        assert Objects.equals(solution.longestPalindrome("abacab"), "bacab");
    }

    @Test
    public void example5() {
        assert Objects.equals(solution.longestPalindrome("caba"), "aba");
    }

    @Test
    public void example6() {
        assert Objects.equals(solution.longestPalindrome("ccc"), "ccc");
    }

    @Test
    public void example7() {
        assert Objects.equals(solution.longestPalindrome("aaabaaaa"), "aaabaaa");
    }
}
