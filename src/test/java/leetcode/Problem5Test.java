package leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem5Test {

    @Test
    public void babad() {
        String result = Problem5.longestPalindrome("babad");
        assertThat(result, either(is("bab")).or(is("aba")));
    }

    @Test
    public void cbbd() {
        String result = Problem5.longestPalindrome("cbbd");
        assertThat(result, is("bb"));
    }

    @Test
    public void a() {
        String result = Problem5.longestPalindrome("a");
        assertThat(result, is("a"));
    }

    @Test
    public void abacab() {
        String result = Problem5.longestPalindrome("abacab");
        assertThat(result, is("bacab"));
    }

    @Test
    public void caba() {
        String result = Problem5.longestPalindrome("caba");
        assertThat(result, is("aba"));
    }

    @Test
    public void ccc() {
        String result = Problem5.longestPalindrome("ccc");
        assertThat(result, is("ccc"));
    }

    @Test
    public void aaabaaaa() {
        String result = Problem5.longestPalindrome("aaabaaaa");
        assertThat(result, is("aaabaaa"));
    }
}
