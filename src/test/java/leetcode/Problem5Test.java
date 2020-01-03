package leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem5Test {
    protected Problem5 solution = new Problem5();

    public static class AlternativeTest extends Problem5Test {
        {
            this.solution = new Problem5.Alternative();
        }
    }

    @Test
    public void babad() {
        String result = solution.longestPalindrome("babad");
        assertThat(result, either(is("bab")).or(is("aba")));
    }

    @Test
    public void cbbd() {
        String result = solution.longestPalindrome("cbbd");
        assertThat(result, is("bb"));
    }

    @Test
    public void a() {
        String result = solution.longestPalindrome("a");
        assertThat(result, is("a"));
    }

    @Test
    public void abacab() {
        String result = solution.longestPalindrome("abacab");
        assertThat(result, is("bacab"));
    }

    @Test
    public void caba() {
        String result = solution.longestPalindrome("caba");
        assertThat(result, is("aba"));
    }

    @Test
    public void ccc() {
        String result = solution.longestPalindrome("ccc");
        assertThat(result, is("ccc"));
    }

    @Test
    public void aaabaaaa() {
        String result = solution.longestPalindrome("aaabaaaa");
        assertThat(result, is("aaabaaa"));
    }
}
